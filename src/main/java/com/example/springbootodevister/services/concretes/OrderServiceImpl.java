package com.example.springbootodevister.services.concretes;

import com.example.springbootodevister.entity.Order;
import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.mappers.OrderMapper;
import com.example.springbootodevister.mappers.ProductMapper;
import com.example.springbootodevister.repository.OrderRepository;
import com.example.springbootodevister.repository.ProductRepository;
import com.example.springbootodevister.services.abstracts.OrderService;
import com.example.springbootodevister.services.dtos.request.AddOrderRequest;
import com.example.springbootodevister.services.dtos.response.AddOrderResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public AddOrderResponse add(AddOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromAndRequest(request);
        order = orderRepository.save(order);
        AddOrderResponse addOrderResponse = OrderMapper.INSTANCE.addResponseFromOrder(order);

        return addOrderResponse;
    }



}
