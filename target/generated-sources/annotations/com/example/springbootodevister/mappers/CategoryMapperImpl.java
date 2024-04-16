package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Category;
import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-16T11:06:19+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category categoryFromRequest(AddCategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( request.getName() );

        return category;
    }

    @Override
    public AddCategoryResponse addResponseFromCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        AddCategoryResponse addCategoryResponse = new AddCategoryResponse();

        return addCategoryResponse;
    }
}
