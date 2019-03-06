package com.Task.Taskplanner.Services;

import com.Task.Taskplanner.Model.Task;
import com.Task.Taskplanner.Model.User;

import java.util.Date;
import java.util.List;

public interface TaskService {
    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void removeTask(String id);

    Task updateTask(String id, String description, Date expirationDate, String status);
}