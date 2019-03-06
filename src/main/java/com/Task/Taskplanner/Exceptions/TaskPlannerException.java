package com.Task.Taskplanner.Exceptions;

public class TaskPlannerException extends Exception {

    public static String EXISTING_ID="THE ID GIVEN ALREADY EXISTS";


    public TaskPlannerException(String message){
        super(message);

    }
}