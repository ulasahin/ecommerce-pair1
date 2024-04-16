package com.example.springbootodevister.controller;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.abstracts.ProductService;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddProductResponse;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;



    @PostMapping
    public AddProductResponse add(@RequestBody @Valid AddProductRequest request){

        return productService.add(request);
    }
    @GetMapping
    public List<ListProductResponse> getAll(){

        return productService.getAll();
    }
    @GetMapping("/{getName}")
    public List<ListProductResponse> getName(@RequestParam String name) {
        return productService.searchByName(name);

   }
   @PutMapping
    private String update(@RequestBody Product product){
        productService.update(product);
        return "Başarıyla Eklendi.";
    }
    @DeleteMapping
    private String delete(@RequestParam int id){
        productService.delete(id);
        return "Başarıyla Silindi.";
    }

}


