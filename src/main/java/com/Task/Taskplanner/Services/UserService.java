package com.Task.Taskplanner.Services;

import com.Task.Taskplanner.Model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User getUserById();

    User createUser();

    User updateUser();

    void removeUser();
}