package com.practice.Employee_Management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.Employee_Management_system.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
