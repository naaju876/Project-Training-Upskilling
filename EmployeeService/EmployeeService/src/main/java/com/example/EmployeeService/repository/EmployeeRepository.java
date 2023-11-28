package com.example.EmployeeService.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeService.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}


