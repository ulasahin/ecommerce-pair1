package com.example.springbootodevister.services.dtos.request;

import com.example.springbootodevister.entity.OrderStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderRequest {
  private int productId;
  private int quantity;
  private int userId;
  private LocalDateTime date;
  @Enumerated(EnumType.STRING)
  private OrderStatus status;

}
