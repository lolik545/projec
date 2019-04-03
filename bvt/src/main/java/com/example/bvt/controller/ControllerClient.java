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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerClient {
    @Autowired
    private ServiceClient serviceClient;
private Client client;
    @PostMapping("/saveClient")
    public ResponseEntity saveClient(@RequestBody Client client) {
        serviceClient.save(client);
        return ResponseEntity.ok("");

    }

    @PostMapping("/getClientById/{id}")
    public ResponseEntity getClientByiD(@PathVariable Long id) {
        return ResponseEntity.ok(serviceClient.getOne(id));
    }

    @PostMapping("/getAllClients")
    public ResponseEntity getAllClients() {
        return ResponseEntity.ok(serviceClient.getAll());
    }

    @PostMapping("/getAllClientToToningId/{id}")
    public ResponseEntity getAllClientToToningId(@PathVariable Long id) {
        return ResponseEntity.ok(serviceClient.getAllToToningID(id));
    }

    @PostMapping("/deleteClientbyID{id}")
    public ResponseEntity deleteClientByID(@PathVariable Long id) {
        serviceClient.deleteForId(id);
        return ResponseEntity.ok("deleted");
    }
    @PostMapping("/changeClientContactsById/{id}/contact/{contact}")
    public ResponseEntity changeClientContact(@PathVariable Long id,@PathVariable String contact){
       if (serviceClient.getClientByID(id).isPresent()){
          client= serviceClient.getOne(id);
          client.setContact(contact);
       serviceClient.save(client);
       }
         return ResponseEntity.ok("changed");
    }

}