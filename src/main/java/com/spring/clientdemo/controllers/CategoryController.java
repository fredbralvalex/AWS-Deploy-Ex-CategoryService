package com.spring.clientdemo.controllers;

import com.spring.clientdemo.Category;
import com.spring.clientdemo.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // localhost:8088
@RequestMapping("categories") //root localhost:8088/categories
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")// localhost:8088/categories/all
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }

    @PostMapping("/add") // localhost:8088/categories/add
    public Category addCategory(@RequestBody Category category) {
        return categoryService.add(category);
    }
}

