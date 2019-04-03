package com.example.bvt.repository;

import com.example.bvt.component.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDepartament extends JpaRepository<Departament, Long> {
}
