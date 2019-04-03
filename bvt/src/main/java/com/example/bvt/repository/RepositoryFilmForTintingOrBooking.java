package com.example.bvt.repository;

import com.example.bvt.component.FilmForTintingOrBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFilmForTintingOrBooking extends JpaRepository<FilmForTintingOrBooking, Long> {
}
