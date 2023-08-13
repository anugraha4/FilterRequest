package com.example.FilterRequest.controller;

import com.example.FilterRequest.dto.Surgery;
import com.example.FilterRequest.model.SurgeryResponse;
import com.example.FilterRequest.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SurgeryController {
    @Autowired
    private SurgeryService surgeryService;

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Surgery> viewRequestofAll() {
        return surgeryService.viewRequest();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/filter", consumes = "application/json", produces = "application/json")
    public List<Surgery> getResults(@RequestBody Surgery r) {
        SurgeryResponse surgeryResponse = new SurgeryResponse();
        surgeryResponse.setMessage("Successfully");
        return surgeryService.getStatus(r.getStatus());
    }


}
