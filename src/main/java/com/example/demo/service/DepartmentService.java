package com.example.demo.service;

import com.example.demo.entity.Department;

public interface DepartmentService {
    Department saveDeparment(Department department);

    Department updateDepartment(Department department);

    String deleteDepartment(Long id);
}
