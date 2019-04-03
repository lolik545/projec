package com.example.bvt.modelDTO;

import com.example.bvt.component.ToningAndBooking;
import lombok.Data;
import org.springframework.stereotype.Component;


public class ToningAndBookingDTO {

    private long id;
    private String description;
    private String adress;

    public ToningAndBookingDTO() {
    }

    public ToningAndBookingDTO(Long id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public ToningAndBookingDTO(ToningAndBooking toningAndBooking) {
        this.id = toningAndBooking.getId();
        this.adress = toningAndBooking.getAdress();
        this.description = toningAndBooking.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

