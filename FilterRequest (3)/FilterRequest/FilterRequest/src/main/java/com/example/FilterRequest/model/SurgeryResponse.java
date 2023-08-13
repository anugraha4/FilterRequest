package com.example.FilterRequest.model;

import com.example.FilterRequest.dto.Surgery;

import java.util.List;

public class SurgeryResponse {
    private String message;
    private List<Surgery> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Surgery> getData() {
        return data;
    }

    public void setData(List<Surgery> data) {
        this.data = data;
    }
}
