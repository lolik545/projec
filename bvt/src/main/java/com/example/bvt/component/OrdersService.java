package com.example.bvt.component;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class OrdersService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idToningAndBoking;
    private Long idFilmForTinigOrBooking;
    private Long idClient;
    private Long idEmployer;
    private boolean theOrderIsComplete ;

}
