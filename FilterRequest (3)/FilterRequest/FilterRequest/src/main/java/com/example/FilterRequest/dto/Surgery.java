package com.example.FilterRequest.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "filterstatus")
public class Surgery {

    @Id
    @GeneratedValue
    private int id;
    private String ticket_Id;
    private String name;
    private String time;
    private String status;
    private Date date;

    public Surgery() {
    }

    public Surgery(int id, String ticket_Id, String name, String time, String status, Date date) {
        this.id = id;
        this.ticket_Id = ticket_Id;
        this.name = name;
        this.time = time;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicket_Id() {
        return ticket_Id;
    }

    public void setTicket_Id(String ticket_Id) {
        this.ticket_Id = ticket_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}