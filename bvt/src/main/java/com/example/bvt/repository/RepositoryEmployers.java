package com.example.bvt.repository;

import com.example.bvt.component.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployers extends JpaRepository<Employer,Long> {

}
