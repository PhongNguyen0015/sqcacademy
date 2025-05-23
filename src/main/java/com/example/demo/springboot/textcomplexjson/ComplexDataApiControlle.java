package com.example.demo.springboot.textcomplexjson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ComplexDataApiControlle {
    @GetMapping("/company-data")
    public CompanyData getCompanyData() {
        CompanyData companyData = new CompanyData();
        companyData.setCompanyName("Tech Solutions Inc.");
        companyData.setFoundedYear(2005);
        companyData.setTotalEmployees(3);
        companyData.setActiveProjects(1);

        // Employees
        Map<String, String> aliceContact = new HashMap<>();
        aliceContact.put("email", "alice@tech.com");
        aliceContact.put("phone", "111-222-3333");
        Employee alice = new Employee();
        alice.setId("EMP001");
        alice.setName("Alice Wonderland");
        alice.setPosition("Software Engineer");
        alice.setDepartment("Engineering");
        alice.setSkills(Arrays.asList("Java", "Spring Boot", "React", "SQL"));
        alice.setContact(aliceContact);

        Map<String, String> bobContact = new HashMap<>();
        bobContact.put("email", "bob@tech.com");
        bobContact.put("phone", "444-555-6666");
        Employee bob = new Employee();
        bob.setId("EMP002");
        bob.setName("Bob The Builder");
        bob.setPosition("Project Manager");
        bob.setDepartment("Management");
        bob.setSkills(Arrays.asList("Project Planning", "Agile", "Scrum"));
        bob.setContact(bobContact);

        Map<String, String> charlieContact = new HashMap<>();
        charlieContact.put("email", "charlie@tech.com");
        charlieContact.put("phone", "777-888-9999");
        Employee charlie = new Employee();
        charlie.setId("EMP003");
        charlie.setName("Charlie Chaplin");
        charlie.setPosition("UI/UX Designer");
        charlie.setDepartment("Design");
        charlie.setSkills(Arrays.asList("Figma", "Sketch", "Photoshop"));
        charlie.setContact(charlieContact);

        companyData.setEmployees(Arrays.asList(alice, bob, charlie));

        // Projects
        Project project1 = new Project();
        project1.setProjectId("PROJ001");
        project1.setName("E-commerce Platform");
        project1.setStatus("In Progress");
        project1.setStartDate("2024-01-15");
        project1.setMembers(Arrays.asList("EMP001", "EMP003"));

        Project project2 = new Project();
        project2.setProjectId("PROJ002");
        project2.setName("Internal CRM System");
        project2.setStatus("Completed");
        project2.setStartDate("2023-05-01");
        project2.setEndDate("2024-03-30");
        project2.setMembers(Arrays.asList("EMP002"));

        companyData.setProjects(Arrays.asList(project1, project2));

        return companyData;
    }
}
