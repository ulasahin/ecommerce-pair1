package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Order;
import com.example.springbootodevister.services.dtos.request.AddOrderRequest;
import com.example.springbootodevister.services.dtos.response.AddOrderResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-16T11:06:19+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderFromAndRequest(AddOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        return order;
    }

    @Override
    public AddOrderResponse addResponseFromOrder(Order order) {
        if ( order == null ) {
            return null;
        }

        AddOrderResponse addOrderResponse = new AddOrderResponse();

        return addOrderResponse;
    }
}
