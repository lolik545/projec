package com.example.bvt.service;

import com.example.bvt.component.Employer;

import java.util.List;

public interface ServiceEmployer {
    public void deleteAllEmployer();

    public void save(Employer employer);

    public List<Employer> getAll();

    public Employer getOne(Long id);

    public void deleteForId(Long id);

    public List<Employer> findAllEmployersByIdToning(Long idToning);

    public void changeEmployerIdBokingAndToning(Long id, Long idToningAndBooking);

    public List<Employer> findByLastNameAndFirsName(String firstName, String lastName);

}
