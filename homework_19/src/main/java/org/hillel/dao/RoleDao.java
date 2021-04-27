package org.hillel.dao;

import org.hillel.entity.Role;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class RoleDao implements DAO<Role> {
    private Connection con;

    public RoleDao(Connection con){
        this.con = con;
    }

    @Override
    public void create(Role entity) {

    }

    @Override
    public Role read(long id) {
        return null;
    }

    @Override
    public void update(Role entity) {

    }

    @Override
    public void delete(long id) {

    }

    public List getUsers(long groupId){
        return new ArrayList();
    }

}
