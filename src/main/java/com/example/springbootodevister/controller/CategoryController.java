package com.example.springbootodevister.controller;

import com.example.springbootodevister.services.abstracts.CategoryService;
import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {
    CategoryService categoryService;
    @PostMapping
    public AddCategoryResponse add(@RequestBody AddCategoryRequest request){
        return categoryService.add(request);
    }
}
