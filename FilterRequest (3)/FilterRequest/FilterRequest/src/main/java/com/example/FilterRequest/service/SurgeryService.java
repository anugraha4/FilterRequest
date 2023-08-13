package com.example.FilterRequest.service;

import com.example.FilterRequest.dto.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> viewRequest();
   List<Surgery> getStatus(String status);
}
