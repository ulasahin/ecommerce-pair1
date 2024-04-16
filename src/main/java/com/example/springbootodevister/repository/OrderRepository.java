package com.example.springbootodevister.repository;

import com.example.springbootodevister.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
