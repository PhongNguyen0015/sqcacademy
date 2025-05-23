package com.example.demo.springboot.textcomplexjson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComplexDataViewController {
    @GetMapping("/company")
    public String showCompanyDashboard() {
        return "company-dashboard"; // Tên của file company-dashboard.html
    }
}
