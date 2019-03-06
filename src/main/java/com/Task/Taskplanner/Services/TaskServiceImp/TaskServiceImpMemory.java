package com.Task.Taskplanner.Services.TaskServiceImp;

import com.Task.Taskplanner.Model.Task;
import com.Task.Taskplanner.Model.User;
import com.Task.Taskplanner.Services.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceImpMemory implements TaskService {
    HashMap<String,Task> tasks = new HashMap<>();

    @Override
    public List<Task> geTasksList() {
        List<Task> list = new ArrayList<Task>(tasks.values());
        return list;
    }

    @Override
    public Task getTaskById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        List<Task> list = new ArrayList<Task>(tasks.values());
        List<Task> result = new ArrayList<Task>();
        for(int i=0;i<list.size();i++){
            if (list.get(i).getSupervisor().getId().equals(userId)) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        tasks.get(taskId).setSupervisor(user);
        return tasks.get(taskId);
    }

    @Override
    public void removeTask(String id) {
        tasks.remove(id);
    }

    @Override
    public Task updateTask(String id, String description, Date expirationDate, String status) {
        tasks.put(id,new Task(id,description,expirationDate,status));
        return null;
    }

}
