package com.example.demo.springboot.textCSR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CsrController {
    @GetMapping("/products/csr")
    public String showProductsCsr() {
        return "products-csr"; // Tên của file products-csr.html
    }
}
