package com.example.bvt.controller;

import com.example.bvt.modelDTO.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerClient {
//@Autowired

    @PostMapping("/saveClient")
    public ResponseEntity saveClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.ok("");
    }
}