package com.example.DepartmentService.service;

import com.example.DepartmentService.Dto.DepartmentDto;

public interface DepartmentService {
	
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
