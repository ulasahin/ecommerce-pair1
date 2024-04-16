package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddProductResponse;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product productFromAndRequest(AddProductRequest request);
    AddProductResponse addResponseFromProduct(Product product);
    List<ListProductResponse> listProductResponse(List<Product> products);

}
