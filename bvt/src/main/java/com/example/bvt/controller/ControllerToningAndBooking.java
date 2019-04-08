package com.example.bvt.controller;

import com.example.bvt.component.ToningAndBooking;
import com.example.bvt.component.convertionToJson.ObjectToJson;
import com.example.bvt.modelDTO.ToningAndBookingDTO;
import com.example.bvt.repository.RepositoryToningAndBooking;
import com.example.bvt.service.ServiceToningAndBooking;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Controller
public class ControllerToningAndBooking {
    @Autowired
    private ServiceToningAndBooking serviceToningAndBooking;

    @Autowired
    private Optional<ToningAndBooking> toningAndBookingOptional;

    @PostMapping("/savedService")
    public ResponseEntity saveToningSevice(@RequestBody ToningAndBooking toningAndBooking) {

        ToningAndBooking userModel = serviceToningAndBooking.faindByAdress(toningAndBooking.getAdress());
        if (userModel != null) {
            return ResponseEntity.ok("This adress is used");
        }
        serviceToningAndBooking.save(toningAndBooking);
        return ResponseEntity.ok("SAVED");
    }

    @PostMapping("/deleteService/{id}")
    public ResponseEntity deleteToningService(@PathVariable Long id) {
        serviceToningAndBooking.deleteForId(id);
        return ResponseEntity.ok("Delete");
    }

    @GetMapping("/getOneToningService/{id}")

    public ResponseEntity getOneToningService(@PathVariable Long id) {
        toningAndBookingOptional = serviceToningAndBooking.getOne(id);
        return ResponseEntity.ok(toningAndBookingOptional);
    }

    @GetMapping("/getAllToningService")
    public ResponseEntity getAllToningService() {
        return ResponseEntity.ok(serviceToningAndBooking.getAll());
    }

    @PutMapping("/changeAdressToningService/{id}/adres/{adress}")
    public ResponseEntity changeAdressTOningService(@PathVariable Long id,@PathVariable String adress) {
        serviceToningAndBooking.changeAdress(id, adress);
        return ResponseEntity.ok("changed");
    }

    @GetMapping("/findByAdressToningService/{adress}")
    public ResponseEntity findByAdressToningService(@PathVariable String adress) {
        return ResponseEntity.ok(serviceToningAndBooking.faindByAdress(adress));
    }

}

