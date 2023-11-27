package com.example.DepartmentService.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.DepartmentService.Dto.DepartmentDto;
import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.mapper.DepartmentMapper;
import com.example.DepartmentService.repository.DepartmentRepository;

@Service
@AllArgsConstructor

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
        return departmentDto;
    }
}