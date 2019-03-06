package com.Task.Taskplanner.Services;

import com.Task.Taskplanner.Model.Task;
import com.Task.Taskplanner.Model.User;

import java.util.List;

public interface TaskService {
    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignedTaskToUser(String taskId, User user);

    void removeTask();

    Task updateTask(Task task);
}