package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public Page<Product> getProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(required = false) String category
    ) {

        // ✅ Allowed sort fields
        if (!sortBy.equals("id") && !sortBy.equals("price") && !sortBy.equals("name")) {
            throw new IllegalArgumentException("Invalid sort field: " + sortBy);
        }

        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

        if (category != null) {
            return service.getProductsByCategory(category, pageable);
        }
        return service.getAllProducts(pageable);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        return service.save(product);
    }
}
