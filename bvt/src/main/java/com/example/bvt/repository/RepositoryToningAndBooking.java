package com.example.bvt.repository;

import com.example.bvt.component.ToningAndBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryToningAndBooking extends JpaRepository<ToningAndBooking,Long> {
public ToningAndBooking findByAdress(String adress);
}
