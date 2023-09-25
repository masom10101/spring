package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DeparmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeparmentServiceImpl implements DepartmentService{

    @Autowired
    private DeparmentRepository deparmentRepository;

    @Override
    public Department saveDeparment(Department department) {
        return deparmentRepository.save(department);
    }
}
