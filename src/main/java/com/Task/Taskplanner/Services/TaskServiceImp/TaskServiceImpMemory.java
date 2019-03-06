package com.Task.Taskplanner.Services.TaskServiceImp;

import com.Task.Taskplanner.Model.Task;
import com.Task.Taskplanner.Model.User;
import com.Task.Taskplanner.Services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpMemory implements TaskService {
    @Override
    public List<Task> geTasksList() {
        return null;
    }

    @Override
    public Task getTaskById(String id) {
        return null;
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return null;
    }

    @Override
    public Task assignedTaskToUser(String taskId, User user) {
        return null;
    }

    @Override
    public void removeTask() {

    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
