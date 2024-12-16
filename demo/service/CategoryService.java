package com.example.demo.service;


import com.example.demo.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<Category> getAllCategories(int page, int size);

    Category getCategoryById(Long id);

    Category createCategory(Category category);

    Category updateCategory(Long id, Category categoryDetails);

    void deleteCategory(Long id);
}
