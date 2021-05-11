package org.hillel;

import org.hillel.dao.GroupDao;
import org.hillel.dao.RoleDao;
import org.hillel.dao.UserDao;
import org.hillel.entity.Role;
import org.hillel.entity.User;

import java.sql.*;

public class JdbcDemo
{
  public static void main(String[] args) {
    //    UserDao dao = new UserDao(connection);

//      User user = new User(100, "Ivan", "student", "123456");
//
//      dao.create(user);
//      System.out.println("CREATE :: " + user);

    try (Connection connection = ConnectionManager.getConnection()) {

      try (PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM user_groups WHERE user_id = 2" )) {

        try (ResultSet resultSet1 = preparedStatement1.executeQuery()) {
          while (resultSet1.next()){
            System.out.println(resultSet1.getLong("group_id"));
          }

        } catch (SQLException e) {
          e.printStackTrace();
        }

      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
//
//  }



  }

}
