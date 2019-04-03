package com.example.bvt.component;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Data
@Entity
@AllArgsConstructor

public class FilmForTintingOrBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private double bandwidth;
    private double squareMeter;
    private String color;
    private String classBooking;
    private Long idToningAndBooking;

    public FilmForTintingOrBooking() {
    }

    public FilmForTintingOrBooking(Optional<FilmForTintingOrBooking> filmForToningAndBokingDTO) {
        this.id = filmForToningAndBokingDTO.get().getId();
        this.manufacturer = filmForToningAndBokingDTO.get().getManufacturer();
        this.bandwidth = filmForToningAndBokingDTO.get().getBandwidth();
        this.squareMeter = filmForToningAndBokingDTO.get().getSquareMeter();
        this.classBooking = filmForToningAndBokingDTO.get().getClassBooking();
        this.idToningAndBooking = filmForToningAndBokingDTO.get().idToningAndBooking;
    }
}
