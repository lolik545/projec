package com.example.bvt.controller;

import com.example.bvt.component.Client;
import com.example.bvt.modelDTO.ClientDTO;
import com.example.bvt.service.impl.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClient {
    @Autowired
    private ServiceClient serviceClient;

    @PostMapping("/saveClient")
    public ResponseEntity saveClient(@RequestBody Client client) {
        serviceClient.save(client);
        return ResponseEntity.ok("");

    }

    @PostMapping("/getClientById/{id}")
    public ResponseEntity getClientByiD(@PathVariable Long id) {
        return ResponseEntity.ok(serviceClient.getOne(id));
    }
}