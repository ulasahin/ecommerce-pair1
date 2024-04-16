package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Category;
import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    Category categoryFromRequest(AddCategoryRequest request);

    AddCategoryResponse addResponseFromCategory(Category category);
}
