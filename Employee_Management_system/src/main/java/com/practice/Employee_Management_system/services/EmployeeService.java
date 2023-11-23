package com.practice.Employee_Management_system.services;

import java.util.List;

import com.practice.Employee_Management_system.model.Employee;

public interface EmployeeService {

    public void addUser(Employee emp);

    public void deleteUser(Long id);

    List<Employee> getAllUsers();

}
