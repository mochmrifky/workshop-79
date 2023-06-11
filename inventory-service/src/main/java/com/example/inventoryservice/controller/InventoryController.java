package com.example.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private List<Inventory> getInventories() {
		return inventoryRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void createInventory(@RequestBody Inventory inventory) {
		inventoryRepository.save(inventory);
	}

}
