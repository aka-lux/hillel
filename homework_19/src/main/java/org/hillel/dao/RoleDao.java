package org.hillel.dao;

import org.hillel.entity.Group;
import org.hillel.entity.Role;
import org.hillel.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleDao implements DAO<Role> {

    public static final String INSERT_ROLE = "INSERT INTO roles(id, name, description) VALUES (?, ?, ?)";
    public static final String SELECT_ROLE = "SELECT * from roles WHERE id = ?";
    public static final String UPDATE_ROLE = "UPDATE roles SET name = ? , description = ? WHERE id = ?";
    public static final String DELETE_ROLE = "DELETE FROM roles WHERE id = ";
    public static final String SELECT_USERS_WITH_ROLE = "SELECT * from users WHERE role = ? ";
    public static final String SELECT_USER_GROUPS = "SELECT * FROM user_groups WHERE user_id = ";


    private Connection con;

    public RoleDao(Connection con){
        this.con = con;
    }

    @Override
    public void create(Role entity) {
        try (PreparedStatement ps = con.prepareStatement(INSERT_ROLE)) {
          //  ps.setLong(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getDescription());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Role read(long id) {
        Role role = null;

        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_ROLE)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");

                role = new Role(id,name,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return role;
    }

    @Override
    public void update(Role entity) {
        try (PreparedStatement ps = con.prepareStatement(UPDATE_ROLE)) {
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
            stmt.execute(DELETE_ROLE + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getUsers(long roleId){
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Long> groupIds = new ArrayList<>();

        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USERS_WITH_ROLE)) {
            preparedStatement.setLong(1, roleId);
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
