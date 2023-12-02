package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entities.Product;
import com.cdac.services.ProductService;

@RestController
public class MyController {
	@Autowired
	private ProductService productService;
	
	// Get All Products
	@GetMapping("/products")
	public List<Product> getProducts()
	{
	
		return this.productService.getProducts();
	}
	
	// Get single Product 
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable String productId) {
		
		return this.productService.getProduct(Long.parseLong(productId));
	}
	
	// add Product
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		
		return this.productService.addProduct(product);
		
	}
	
	// Update Product using Put request
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		
		return this.productService.updateProduct(product);
	}
	
	// Delete the Product
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
	
		try {
			this.productService.deleteProduct(Long.parseLong(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
