package org.hillel.dao;

import org.hillel.ConnectionManager;
import org.hillel.entity.Group;
import org.hillel.entity.Role;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class GroupDaoTest {

    @Test
    public void groupDaoTest(){
        try (Connection connection = ConnectionManager.getConnection()) {
            GroupDao groupDao = new GroupDao(connection);
            groupDao.create(new Group(7, "testGroup", "testDescription"));
            System.out.println(groupDao.read(1));
            groupDao.update(new Group(7, "testGroup2", "testDescription2"));
            groupDao.delete(7);
            System.out.println(groupDao.getUsers(4));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}