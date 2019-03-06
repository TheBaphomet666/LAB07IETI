package com.Task.Taskplanner.Services.UserServiceImp;

import com.Task.Taskplanner.Exceptions.TaskPlannerException;
import com.Task.Taskplanner.Model.User;
import com.Task.Taskplanner.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpMemory implements UserService {
    HashMap<String,User> users = new HashMap<>();

    @Override
    public List<User> getUsersList() {
        List<User> list = new ArrayList<User>(users.values());
        return null;
    }

    @Override
    public User getUserById(String id) {
        return users.get(id);
    }

    @Override
    public User createUser(String id, String username, String password, String fullName) throws TaskPlannerException {
        if(users.containsKey(id)){
            throw new TaskPlannerException(TaskPlannerException.EXISTING_ID);

        }
        users.put(id,new User(id,username,password,fullName));
        return null;
    }

    @Override
    public User updateUser(String id, String username, String password, String fullName) {
        users.put(id,new User(id,username,password,fullName));
        return users.get(id);
    }

    @Override
    public void removeUser(String id) {
        users.remove(id);
    }

}
