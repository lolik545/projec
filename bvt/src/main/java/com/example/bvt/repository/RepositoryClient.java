package com.example.bvt.repository;

import com.example.bvt.component.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository<Client, Long> {
}
