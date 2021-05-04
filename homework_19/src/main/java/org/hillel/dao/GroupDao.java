package org.hillel.dao;

import org.hillel.entity.Group;
import org.hillel.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GroupDao implements DAO<Group> {

    public static final String INSERT_GROUP = "INSERT INTO groups(id, name, description) VALUES (?, ?, ?)";
    public static final String SELECT_GROUP = "SELECT * from groups WHERE id = ?";
    public static final String UPDATE_GROUP = "UPDATE groups SET name = ? , description = ? WHERE id = ?";
    public static final String DELETE_GROUP = "DELETE FROM groups WHERE id = ";
    public static final String SELECT_USERS_WITH_GROUP = "SELECT * from user_groups ug " +
                                                         "join users u on user_id = id " +
                                                        "where group_id = ?";
    public static final String SELECT_USER_GROUPS = "SELECT * FROM user_groups WHERE user_id = ";


    private Connection con;

    public GroupDao(Connection con) {
        this.con = con;
    }

    @Override
    public void create(Group entity) {
        try (PreparedStatement ps = con.prepareStatement(INSERT_GROUP)) {
           // ps.setLong(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getDescription());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Group read(long id) {
        Group group = null;

        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_GROUP)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");

                group = new Group(id,name,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return group;
    }

    @Override
    public void update(Group entity) {
        try (PreparedStatement ps = con.prepareStatement(UPDATE_GROUP)) {
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getDescription());
            ps.setLong(3, entity.getId());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_GROUP + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getUsers(long groupId){
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Long> groupIds = new ArrayList<>();

        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USERS_WITH_GROUP)) {
            preparedStatement.setLong(1, groupId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()){
                    Long id = resultSet.getLong("id");
                    String name = resultSet.getString("name");
                    String login = resultSet.getString("login");
                    String password = resultSet.getString("password");
                    Long role = resultSet.getLong("role");

                    try (PreparedStatement preparedStatement1 = con.prepareStatement(SELECT_USER_GROUPS + id)) {

                        try (ResultSet resultSet1 = preparedStatement1.executeQuery()) {
                            while (resultSet1.next()){
                                groupIds.add(resultSet1.getLong("group_id"));
                            }

                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    users.add(new User(id,name,login,password,groupIds,role));
                    groupIds = new ArrayList<>();
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }

}
