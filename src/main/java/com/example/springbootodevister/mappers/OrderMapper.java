package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Order;
import com.example.springbootodevister.services.dtos.request.AddOrderRequest;
import com.example.springbootodevister.services.dtos.response.AddOrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderFromAndRequest(AddOrderRequest request);

    AddOrderResponse addResponseFromOrder(Order order);

}
