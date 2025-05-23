package com.example.demo.springboot.textSSR;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductControllerText {
    @GetMapping("/products/show")
    public String showProduct(Model model) {
        List<ProductShow> products = Arrays.asList(
                new ProductShow(1L, "Laptop", 1200.00),
                new ProductShow(2L, "Mouse", 25.00),
                new ProductShow(3L, "Keyboard", 75.00)
        );
        model.addAttribute("products", products);
        return "product";
    }
}
