package com.example.demo.springboot.textCSR;

import com.example.demo.springboot.textSSR.ProductShow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class ProductsCSR {
    @GetMapping("/api/products")
    public List<ProductShow> getAllProduct() {
        return Arrays.asList(
                new ProductShow(101L, "Smartphone", 800.00),
                new ProductShow(102L, "Headphones", 150.00),
                new ProductShow(103L, "Smartwatch", 250.00)
        );
    }
}
