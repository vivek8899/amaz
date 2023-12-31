package com.amazonclone.Amazon_Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	
	private Long productId;
	private String productName;
	private String image;
	private String description;
	private Integer quantity;
	private double price;
	private double discount;
	private String size;
	private double specialPrice;
	private String color;

}
