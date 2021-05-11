package org.hillel.dao;

import org.hillel.ConnectionManager;
import org.hillel.entity.Role;
import org.hillel.entity.User;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void userDaoTest(){
        ArrayList<Long> groupIds1 = new ArrayList<Long>();
        groupIds1.add(1L);
        groupIds1.add(2L);

        ArrayList<Long> groupIds2 = new ArrayList<Long>();
        groupIds2.add(3L);
        groupIds2.add(4L);

        try (Connection connection = ConnectionManager.getConnection()) {
            UserDao userDao = new UserDao(connection);
            userDao.create(new User(5, "testName", "testLogin","testPass",groupIds1,1));
            System.out.println(userDao.read(5));
            userDao.update(new User(5, "testName2", "testLogin2","testPass2",groupIds2,1));
            System.out.println(userDao.read(5));

            userDao.delete(5);
           // System.out.println(userDao.getUsers(2));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}