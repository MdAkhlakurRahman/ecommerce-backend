package com.example.ecommerce.service;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Page<Product> getAllProducts(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Product> getProductsByCategory(String category, Pageable pageable) {
        return repository.findByCategory(category, pageable);
    }

    public Product save(Product product) {
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Product price must be positive");
        }
        return repository.save(product);
    }
}
