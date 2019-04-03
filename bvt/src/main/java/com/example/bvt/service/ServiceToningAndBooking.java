package com.example.bvt.service;

import com.example.bvt.component.ToningAndBooking;

import java.util.List;
import java.util.Optional;

public interface ServiceToningAndBooking {
    public void save(ToningAndBooking toningAndBooking);

    public List<ToningAndBooking> getAll();

    public Optional<ToningAndBooking> getOne(Long id);

    public void deleteForId(Long id);

    public void changeAdress(Long id, String adress);

    public ToningAndBooking changeDescription(Long id, String description);

    public ToningAndBooking faindByAdress(String adress);
}
