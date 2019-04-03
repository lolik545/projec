package com.example.bvt.component;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class ToningAndBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @NotBlank
    private String adress;

    public ToningAndBooking() {
    }

    public ToningAndBooking(Long id, String adress, String description) {
        this.id = id;
        this.adress = adress;
        this.description = description;
    }
}
