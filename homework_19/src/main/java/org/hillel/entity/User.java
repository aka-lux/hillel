package org.hillel.entity;

import java.util.ArrayList;

public class User
{
  private long id;
  private String name;
  private String login;
  private String password;
  private ArrayList<Long> groupIds;
  private long roleId;

  public User(long id, String name, String login, String password, ArrayList<Long> groupIds, long roleId)
  {
    this.id = id;
    this.name = name;
    this.login = login;
    this.password = password;
    this.groupIds = groupIds;
    this.roleId = roleId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ArrayList<Long> getGroups() {    return groupIds;  }

  public void setGroup(ArrayList<Long> group) {    this.groupIds = group;  }

  public Long getRole() {    return roleId;  }

  public void setRole(Long role) {    this.roleId = role;  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", group=" + groupIds +
            ", role=" + roleId +
            '}';
  }
}
