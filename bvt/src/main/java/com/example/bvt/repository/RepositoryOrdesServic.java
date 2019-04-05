package com.example.bvt.repository;

import com.example.bvt.component.OrdersService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOrdesServic extends JpaRepository<OrdersService,Long> {
}
