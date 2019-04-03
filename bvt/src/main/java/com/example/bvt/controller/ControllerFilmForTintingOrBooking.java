package com.example.bvt.controller;

import com.example.bvt.component.FilmForTintingOrBooking;
import com.example.bvt.service.impl.ServiceFilmForTintingOrBookings;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ControllerFilmForTintingOrBooking {

    private final ServiceFilmForTintingOrBookings serviceFilmForTintingOrBookings;

    @PostMapping("saveFilm")
    public ResponseEntity saveFilm(@RequestBody FilmForTintingOrBooking filmForTintingOrBooking) {
        serviceFilmForTintingOrBookings.save(filmForTintingOrBooking);
        return ResponseEntity.ok(filmForTintingOrBooking + "saved");
    }

    @PostMapping("/deleteFilm/{id}")
    public ResponseEntity deleteFilmById(@PathVariable Long id) {
        serviceFilmForTintingOrBookings.deletebyId(id);
        return ResponseEntity.ok("Delete");
    }

    @GetMapping("/getOneFilmByID/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceFilmForTintingOrBookings.findById(id));
    }

    @GetMapping("findAll")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(serviceFilmForTintingOrBookings.getAll());
    }

}
