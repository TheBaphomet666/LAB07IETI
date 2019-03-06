package com.Task.Taskplanner.Model;

public class User {

    private String Id;
    private String username;
    private String password;
    private String fullName;

    public User(String id, String username, String password,String fullName) {
        Id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
