package com.example.springbootodevister.services.dtos.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    private String name;
    @Min(value = 0,message = "Ürün fiyatı 0'dan küçük olamaz")
    private double unitPrice;
    @Min(value = 0, message = "Stok değeri 0'dan küçük olamaz")
    private int stock;

    private String statement;
}
