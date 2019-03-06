package com.Task.Taskplanner.Services;

import com.Task.Taskplanner.Exceptions.TaskPlannerException;
import com.Task.Taskplanner.Model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User getUserById(String id);

    User createUser(String id, String username, String password,String fullName) throws TaskPlannerException;

    User updateUser(String id, String username, String password,String fullName);

    void removeUser(String id);
}