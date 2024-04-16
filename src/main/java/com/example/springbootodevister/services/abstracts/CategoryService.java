package com.example.springbootodevister.services.abstracts;

import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;

public interface CategoryService {
    AddCategoryResponse add(AddCategoryRequest request);


}
