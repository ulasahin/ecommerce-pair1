package com.example.springbootodevister.services.abstracts;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddProductResponse;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;

import java.util.List;

public interface ProductService {
     AddProductResponse add(AddProductRequest request);
     List<ListProductResponse> getAll();
     List<ListProductResponse> searchByName(String name);
     List<ListProductResponse> searchByUnitPrice(int minPrice, int maxPrice);

     void update(Product product);
     void delete (int id);
     Product getById(int id);

}
