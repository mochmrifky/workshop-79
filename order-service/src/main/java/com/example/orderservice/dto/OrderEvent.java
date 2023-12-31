package com.example.orderservice.dto;

import com.example.orderservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderEvent {
    private String message;
    private String status;
    private Order order;
}
