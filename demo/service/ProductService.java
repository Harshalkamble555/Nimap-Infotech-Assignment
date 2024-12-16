package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<Product> getAllProducts(int page, int size);

    Product getProductById(Long id);

    Product createProduct(Product product, Long categoryId);

    Product updateProduct(Long id, Product productDetails);

    void deleteProduct(Long id);
}
