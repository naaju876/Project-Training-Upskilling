package com.example.EmployeeService.service;

import com.example.EmployeeService.Dto.APIResponseDto;
import com.example.EmployeeService.Dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
