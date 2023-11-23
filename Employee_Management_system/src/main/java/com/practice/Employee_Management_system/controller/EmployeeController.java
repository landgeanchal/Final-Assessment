package com.practice.Employee_Management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.Employee_Management_system.model.Employee;

import com.practice.Employee_Management_system.services.EmployeeServiceIMPL;

public class EmployeeController {
    @Autowired
    EmployeeServiceIMPL service;

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "registration";
    }

    @PostMapping("/register1")
    public String register1(@ModelAttribute Employee employee) {
        service.addUser(employee);
        System.out.println("UserAdded!");
        return "login";
    }

    @GetMapping("/deleteId/{id}")
    public String deleteUserByid(@PathVariable Long id) {
        service.deleteUser(id);
        return "registration";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Employee> userList = service.getAllUsers();
        model.addAttribute("userList", userList);
        return "userRecord";
    }

}
