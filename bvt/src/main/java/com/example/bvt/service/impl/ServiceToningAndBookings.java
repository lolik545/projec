package com.example.bvt.service.impl;

import com.example.bvt.component.ToningAndBooking;
import com.example.bvt.repository.RepositoryToningAndBooking;
import com.example.bvt.service.ServiceToningAndBooking;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceToningAndBookings implements ServiceToningAndBooking {
    private final RepositoryToningAndBooking repositoryToningAndBooking;
    @Autowired
    private Optional<ToningAndBooking> toningAndBooking;

    @Override
    public void save(ToningAndBooking toningAndBooking) {
        repositoryToningAndBooking.save(toningAndBooking);
    }

    @Override
    public List<ToningAndBooking> getAll() {
        List<ToningAndBooking> toningAndBookings = new ArrayList<>();
        toningAndBookings.addAll(repositoryToningAndBooking.findAll());
        return toningAndBookings;
    }

    @Override
    public Optional<ToningAndBooking> getOne(Long id) {
        return repositoryToningAndBooking.findById(id);
    }


    @Override
    public void deleteForId(Long id) {
        repositoryToningAndBooking.deleteById(id);

    }

    @Override
    public void changeAdress(Long id, String adress) {

        toningAndBooking = repositoryToningAndBooking.findById(id);
        String description = toningAndBooking.get().getDescription();
        repositoryToningAndBooking.save(new ToningAndBooking(id, adress, description));
    }

    @Override
    public ToningAndBooking changeDescription(Long id, String description) {
        return null;
    }

    @Override
    public ToningAndBooking faindByAdress(String adress) {
        return repositoryToningAndBooking.findByAdress(adress);
    }
}