package com.example.demo.springboot.textjson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ViewController {
    @GetMapping("/view")
    public String showView() {
        return "data-view"; // Tên của view HTML
    }

    @ResponseBody
    @GetMapping("/api/data-json")
    public Map<String, Object> getJsonData() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Jane Doe");
        response.put("city", "Đà Nẵng");
        response.put("age", 25);
        response.put("country", "Vietnam");
        return response;
    }
}
