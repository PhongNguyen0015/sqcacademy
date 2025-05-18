package com.example.demo.springboot.controller;

import com.example.demo.springboot.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.springboot.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getAll() {
//        id tự tăng
        Product p1 = new Product("cake", 25.2);
        repo.save(p1);
        return repo.findAll();
    }
}
