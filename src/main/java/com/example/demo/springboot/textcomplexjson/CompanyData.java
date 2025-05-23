package com.example.demo.springboot.textcomplexjson;

import java.util.List;

public class CompanyData {
    private String companyName;
    private int foundedYear;
    private List<Employee> employees;
    private List<Project> projects;
    private int totalEmployees;
    private int activeProjects;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public int getActiveProjects() {
        return activeProjects;
    }

    public void setActiveProjects(int activeProjects) {
        this.activeProjects = activeProjects;
    }
}
