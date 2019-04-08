package com.example.bvt.service.impl;

import com.example.bvt.component.FilmForTintingOrBooking;
import com.example.bvt.modelDTO.FilmForToningAndBokingDTO;
import com.example.bvt.repository.RepositoryFilmForTintingOrBooking;
import com.example.bvt.service.ServiceFilmForTintingOrBooking;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ServiceFilmForTintingOrBookings implements ServiceFilmForTintingOrBooking {
    @Autowired
    private RepositoryFilmForTintingOrBooking repositoryFilmForTintingOrBooking;
    @Autowired
    private Optional<FilmForTintingOrBooking> filmForToningAndBokingDTO;
    @Autowired
    private ServiceToningAndBookings serviceToningAndBookings;

    @Override
    public void save(FilmForTintingOrBooking filmForTintingOrBooking) {
        if (serviceToningAndBookings.getOne(filmForTintingOrBooking.getIdToningAndBooking()).isPresent()) {
            repositoryFilmForTintingOrBooking.save(filmForTintingOrBooking);
        }
    }

    @Override
    public void deletebyId(Long id) {
        repositoryFilmForTintingOrBooking.deleteById(id);
    }

    @Override
    public Optional<FilmForTintingOrBooking> findById(Long id) {
        return repositoryFilmForTintingOrBooking.findById(id);

    }

    @Override
    public List<FilmForTintingOrBooking> getAll() {
        List<FilmForTintingOrBooking> filmForTintingOrBookingList = new ArrayList<>();
        filmForTintingOrBookingList.addAll(repositoryFilmForTintingOrBooking.findAll());
        return filmForTintingOrBookingList;
    }

    @Override
    public void changeSquare(Long id, Integer squareMeter) {

        repositoryFilmForTintingOrBooking.findById(id).isPresent();
        filmForToningAndBokingDTO = repositoryFilmForTintingOrBooking.findById(id);
        filmForToningAndBokingDTO.get().setSquareMeter( squareMeter);
        FilmForTintingOrBooking filmForTintingOrBooking = new FilmForTintingOrBooking(filmForToningAndBokingDTO);
        repositoryFilmForTintingOrBooking.save(filmForTintingOrBooking);
    }

    @Override
    public List<FilmForTintingOrBooking> getAllFilmsForClient() {
        List<FilmForTintingOrBooking> filmForTintingOrBookings = new ArrayList<>();
        List<FilmForTintingOrBooking> listFilms = new ArrayList<>();
        filmForTintingOrBookings = repositoryFilmForTintingOrBooking.findAll();
        for (int i = 0; i <= filmForTintingOrBookings.size() - 1; i++) {
            if (filmForTintingOrBookings.get(i).getSquareMeter() > 0) {
                listFilms.add(filmForTintingOrBookings.get(i));
            }
        }
        return listFilms;
    }

}

