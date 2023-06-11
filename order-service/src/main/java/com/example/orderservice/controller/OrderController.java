package com.example.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.Order;
import com.example.orderservice.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createOrder(@RequestBody Order order) {
		orderRepository.save(order);
	}
}
