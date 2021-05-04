package org.hillel.dao;

import org.hillel.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao implements DAO<User> {

    public static final String INSERT_USER = "INSERT INTO users(id, name, login, password, role) VALUES (?, ?, ?, ?,?)";
    public static final String SELECT_USER = "SELECT * from users WHERE id = ?";
    public static final String UPDATE_USER = "UPDATE users SET name = ? , login = ?, password = ?, role=? WHERE id = ?";
    public static final String DELETE_USER = "DELETE FROM users WHERE id = ";
    public static final String INSERT_USER_GROUP = "INSERT INTO user_groups (user_id, group_id) VALUES (?, ?)";
    public static final String DELETE_USER_GROUP = "DELETE FROM user_groups WHERE user_id = ";
    public static final String SELECT_USER_GROUPS = "SELECT * FROM user_groups WHERE user_id = ";


    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    @Override
    public void create(User entity) {
        try (PreparedStatement ps = con.prepareStatement(INSERT_USER)) {
            // ps.setLong(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getLogin());
            ps.setString(4, entity.getPassword());
            ps.setLong(5, entity.getRole());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (long n : entity.getGroups()) {
            try (PreparedStatement ps = con.prepareStatement(INSERT_USER_GROUP)) {
                ps.setLong(1, entity.getId());
                ps.setLong(2, n);

                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public User read(long id) {
        User user = null;
        ArrayList<Long> groupIds = new ArrayList<>();
        String name = null;
        String login = null;
        String password = null;
        long role = 0;

        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USER)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                name = resultSet.getString("name");
                login = resultSet.getString("login");
                password = resultSet.getString("password");
                role = resultSet.getLong("role");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

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

        user = new User(id, name, login, password, groupIds, role);

        return user;
    }

    @Override
    public void update(User entity) {
        try (PreparedStatement ps = con.prepareStatement(UPDATE_USER)) {
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getLogin());
            ps.setString(3, entity.getPassword());
            ps.setLong(4, entity.getRole());
            ps.setLong(5, entity.getId());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_USER_GROUP + entity.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (long n : entity.getGroups()) {
            try (PreparedStatement ps = con.prepareStatement(INSERT_USER_GROUP)) {
                ps.setLong(1, entity.getId());
                ps.setLong(2, n);

                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void delete(long id) {
        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_USER + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_USER_GROUP + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
