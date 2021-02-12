package springbootWorkshop.MicroServiceProduct.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import springbootWorkshop.MicroServiceProduct.Model.Product;

@Service
public class ProductService {
	public List<Product> products = Arrays.asList(new Product(1L, "Blue Pen", 1), new Product(2L, "Red Pen", 1.2));
	
	public List<Product> getAllProducts() {
		return products;
	}
	
	public Product getProductById(@PathVariable Long id) {
		for (Product p : products) {
			if (p.getId() == id) {
				return p;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found: id=" + id);
	}
}
