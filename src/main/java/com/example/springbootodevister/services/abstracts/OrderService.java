package com.example.springbootodevister.services.abstracts;

import com.example.springbootodevister.services.dtos.request.AddOrderRequest;
import com.example.springbootodevister.services.dtos.response.AddOrderResponse;

public interface OrderService {
    AddOrderResponse add(AddOrderRequest request);
}
