package com.example.springbootodevister.services.dtos.response;

import com.example.springbootodevister.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListProductResponse {


    private String name;
    private double unitPrice;
    private Category category;
}
