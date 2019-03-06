package com.Task.Taskplanner.Model;

import java.util.Date;

public class Task {

    private String Id;
    private String description;
    private Date expirationDate;
    private String status;
    private User supervisor;

    public Task(String id, String description, Date expirationDate, String status) {
        Id = id;
        this.description = description;
        this.expirationDate = expirationDate;
        this.status = status;
    }

    public Task(String id, String description, Date expirationDate, String status, User supervisor) {
        Id = id;
        this.description = description;
        this.expirationDate = expirationDate;
        this.status = status;
        this.supervisor = supervisor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }
}
