package com.example.DepartmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DepartmentService.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}