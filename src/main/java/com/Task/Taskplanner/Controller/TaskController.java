package com.Task.Taskplanner.Controller;

import com.Task.Taskplanner.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Converter")
public class TaskController {

    @Autowired
    TaskService us;


/*

    @RequestMapping(value = "/fahrenheit/{value}",method = RequestMethod.GET)
    public Data ConvertFahrenheitToCelsius(@PathVariable("value") double value){
        Data json = new Data("FahrenheitToCelsius",value,con.FahrenheitToCelsius(value));
        System.out.println(json);
        return json;
    }*/


}