package com.ecom.ecomMomgo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecomMongo.model.Product;
import com.ecom.ecomMongo.repository.ProductRepository;

/**
 * @author aryansh
 *
 */

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Added Product with id : " + product.getId();
	}

	@GetMapping("/findAllProducts")
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@GetMapping("/findProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
		return "Product deleted with id : " + id;
	}

}
