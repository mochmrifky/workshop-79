package com.example.inventoryservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String skuCode;
	private String stock;
	
}
