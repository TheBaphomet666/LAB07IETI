package com.Task.Taskplanner.Controller;

import com.Task.Taskplanner.Model.Task;
import com.Task.Taskplanner.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    TaskService us;



    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Task> getAllUsers(){
        List<Task> json = us.geTasksList();
        //System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Task ConvertFahrenheitToCelsius(@PathVariable("id") String id){
        Task json = us.getTaskById(id);
        System.out.println(json);
        return json;
    }


}