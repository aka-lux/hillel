package org.hillel.dao;

import org.hillel.entity.Group;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GroupDao implements DAO<Group> {

    private Connection con;

    public GroupDao(Connection con) {
        this.con = con;
    }

    @Override
    public void create(Group entity) {

    }

    @Override
    public Group read(long id) {
        return null;
    }

    @Override
    public void update(Group entity) {

    }

    @Override
    public void delete(long id) {

    }

    public List getUsers(long groupId){
        return new ArrayList();
    }

}
