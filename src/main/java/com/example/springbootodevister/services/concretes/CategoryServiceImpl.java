package com.example.springbootodevister.services.concretes;

import com.example.springbootodevister.entity.Category;
import com.example.springbootodevister.mappers.CategoryMapper;
import com.example.springbootodevister.repository.CategoryRepository;
import com.example.springbootodevister.services.abstracts.CategoryService;
import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public AddCategoryResponse add(AddCategoryRequest request) {
        sameWithNoExist(request.getName());
        Category category = CategoryMapper.INSTANCE.categoryFromRequest(request);
        category = categoryRepository.save(category);
        AddCategoryResponse addCategoryResponse = CategoryMapper.INSTANCE.addResponseFromCategory(category);
        return addCategoryResponse;
    }

    private void sameWithNoExist(String name){
        Optional<Category> name1 = categoryRepository.findByName(name);
        if(name1.isPresent()){
            throw new RuntimeException("Aynı isimde kategori bulunmakta");
        }
    }
}
