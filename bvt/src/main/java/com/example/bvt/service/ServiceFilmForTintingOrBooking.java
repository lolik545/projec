package com.example.bvt.service;

import com.example.bvt.component.FilmForTintingOrBooking;

import java.util.List;
import java.util.Optional;

public interface ServiceFilmForTintingOrBooking {


       public void save(FilmForTintingOrBooking filmForTintingOrBooking);

        public void deletebyId(Long id);

       public Optional<FilmForTintingOrBooking> findById(Long id);

       public List<FilmForTintingOrBooking> getAll();
public void changeSquare(Long id,double squareMeter);
}
