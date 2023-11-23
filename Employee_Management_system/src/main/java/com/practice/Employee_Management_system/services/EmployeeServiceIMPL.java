package com.practice.Employee_Management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Employee_Management_system.model.Employee;
import com.practice.Employee_Management_system.repository.EmployeeRepo;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    EmployeeRepo employee;

    @Override
    public void addUser(Employee emp) {
        employee.save(emp);
    }

    @Override
    public void deleteUser(Long id) {
        employee.deleteById(id);
    }

    @Override
    public List<Employee> getAllUsers() {
        return employee.findAll();
    }

}
