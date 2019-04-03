package com.example.bvt.service.impl;

import com.example.bvt.component.Employer;
import com.example.bvt.repository.RepositoryEmployers;
import com.example.bvt.service.ServiceEmployer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceEmployers implements ServiceEmployer {
    private final RepositoryEmployers repositoryEmployers;
    private final ServiceToningAndBookings serviceToningAndBookings;

    @Override
    public void save(Employer employer) {
        if (serviceToningAndBookings.getOne(employer.getIdToningAndBooking()) != null) {
            repositoryEmployers.save(employer);
        }
    }

    @Override
    public List<Employer> getAll() {
        List<Employer> employerList = new ArrayList<>();
        employerList.addAll(repositoryEmployers.findAll());
        return employerList;
    }

    @Override
    public Employer getOne(Long id) {

        return repositoryEmployers.getOne(id);
    }

    @Override
    public void deleteForId(Long id) {
        if (repositoryEmployers.findById(id) != null)
            repositoryEmployers.deleteById(id);
    }

    @Override
    public List<Employer> findAllEmployersByIdToning(Long idToning) {
        List<Employer> list = new ArrayList<>();
        List<Employer> employerList = new ArrayList<>();
        employerList.addAll(repositoryEmployers.findAll());
        for (int i = 0; i <= employerList.size() - 1; i++) {
            if (employerList.get(i).getIdToningAndBooking() == idToning) list.add(employerList.get(i));
        }
        return list;


    }

    @Override
    public void changeEmployerIdBokingAndToning(Long id, Long idToningAndBooking) {
        if (serviceToningAndBookings.getOne(idToningAndBooking) != null) {
            Employer employer = new Employer();
            employer = repositoryEmployers.getOne(id);
            employer.setIdToningAndBooking(idToningAndBooking);
            repositoryEmployers.save(employer);
        }
    }

    @Override
    public List<Employer> findByLastNameAndFirsName(String firstName, String lastName) {
        List<Employer> employerList = new ArrayList<>();
        List<Employer> list = new ArrayList<>();
        String firstNameRepository;
        String lastNameRepository;
        System.out.println(lastName + "    " + firstName);
        employerList.addAll(repositoryEmployers.findAll());
        for (int i = 0; i <= employerList.size() - 1; i++) {
            firstNameRepository = employerList.get(i).getFirstNAma();
            lastNameRepository = employerList.get(i).getLastName();
            if ((firstNameRepository.hashCode() == firstName.hashCode()) && (lastNameRepository.hashCode() == lastName.hashCode())) {
                list.add(employerList.get(i));
            }
        }
        return list;
    }


}
