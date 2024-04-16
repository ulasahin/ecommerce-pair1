package com.example.springbootodevister.repository;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findByName(String name);

    @Query(value = "Select new com.example.springbootodevister.services.dtos.response.ListProductResponse" +
            "(p.name,p.unitPrice,p.category) from Product p Where p.name LIKE concat('%', :query, '%') "
            ,nativeQuery = false)
    List<ListProductResponse> searchByName(String query);
}
