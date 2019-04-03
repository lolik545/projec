package com.example.bvt.modelDTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ClientDTO {
    private long id;
    private String firstNameClient;
    private String lastNameClient;
    private double squareMeter;
    @NotBlank
    private String contact;
}