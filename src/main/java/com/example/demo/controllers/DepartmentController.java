package com.example.demo.controllers;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


    @PostMapping(value = "departments")
    public Department save(@RequestBody Department department) {
        return departmentService.saveDeparment(department);
    }
}
