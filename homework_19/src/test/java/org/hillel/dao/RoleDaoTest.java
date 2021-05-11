package org.hillel.dao;

import org.hillel.ConnectionManager;
import org.hillel.entity.Role;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class RoleDaoTest {

    @Test public void roleDaoTest(){
        try (Connection connection = ConnectionManager.getConnection()) {
            RoleDao roleDao = new RoleDao(connection);
            roleDao.create(new Role(5, "testRole", "testDescription"));
            System.out.println(roleDao.read(1));
            roleDao.update(new Role(5, "testRole2", "testDescription2"));
            roleDao.delete(5);
            System.out.println(roleDao.getUsers(2));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}