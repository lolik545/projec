package com.example.bvt.service.impl;

import com.example.bvt.component.Departament;
import com.example.bvt.component.ToningAndBooking;
import com.example.bvt.repository.RepositoryDepartament;
import com.example.bvt.repository.RepositoryToningAndBooking;
import com.example.bvt.service.ServiceDepartament;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ServiceDepartaments implements ServiceDepartament {
    private final RepositoryDepartament repositoryDepartament;
    private final ServiceToningAndBookings serviceToningAndBookings;

    @Override
    public void save(Departament departament) {
        Boolean present = serviceToningAndBookings.getOne(departament.getIdToningAndBooking()).isPresent();
        if (present == true) {
            repositoryDepartament.save(departament);
        }
    }

    @Override
    public List<Departament> getAll() {

        return repositoryDepartament.findAll();
    }

    @Override
    public Departament getOne(Long id) {

        return repositoryDepartament.getOne(id);
    }

    @Override
    public void deleteForId(Long id) {
        repositoryDepartament.deleteById(id);

    }
}