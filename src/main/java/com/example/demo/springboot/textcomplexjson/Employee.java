package com.example.demo.springboot.textcomplexjson;

import java.util.List;
import java.util.Map;

public class Employee {
    private String id;
    private String name;
    private String position;
    private String department;
    private List<String> skills;
    private Map<String, String> contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, String> getContact() {
        return contact;
    }

    public void setContact(Map<String, String> contact) {
        this.contact = contact;
    }
}
