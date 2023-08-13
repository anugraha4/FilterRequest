package com.example.FilterRequest.service;

import com.example.FilterRequest.dto.Surgery;
import com.example.FilterRequest.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurgeryServiceImpl implements SurgeryService{
    @Autowired
    private SurgeryRepository surgeryRepository;
    @Override
    public List<Surgery> viewRequest() {
        return surgeryRepository.findAll();
    }

    @Override
    public List<Surgery> getStatus(String status) {
        return surgeryRepository.findBystatus(status);
    }


}
