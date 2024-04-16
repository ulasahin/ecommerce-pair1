package com.example.springbootodevister.controller;

import com.example.springbootodevister.services.abstracts.OrderService;
import com.example.springbootodevister.services.dtos.request.AddOrderRequest;
import com.example.springbootodevister.services.dtos.response.AddOrderResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {
    //createorder orderproductlistesi
   private OrderService orderService;
   @PostMapping
   public AddOrderResponse created(@RequestBody @Valid AddOrderRequest request){
      return orderService.add(request);
   }
}
