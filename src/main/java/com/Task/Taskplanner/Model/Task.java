package com.Task.Taskplanner.Model;

import java.util.Date;

public class Task {

    private int Id;
    private String description;
    private Date expirationDate;
    private String status;

    public Task(int id, String description, Date expirationDate, String status) {
        Id = id;
        this.description = description;
        this.expirationDate = expirationDate;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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
}
