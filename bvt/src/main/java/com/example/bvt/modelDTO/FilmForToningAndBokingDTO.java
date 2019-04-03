package com.example.bvt.modelDTO;

import lombok.Data;

@Data

public class FilmForToningAndBokingDTO {
    private Long id;
    private String manufacturer;
    private double bandwidth;
    private double squareMeter;
    private String color;
    private String classBooking;
    private Long idToningAndBooking;
}
