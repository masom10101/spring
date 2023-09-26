package com.example.demo.controllers;

import com.example.demo.entity.Department;
import com.example.demo.repository.DeparmentRepository;
import com.example.demo.service.DeparmentServiceImpl;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DeparmentRepository deparmentRepository;


    @PostMapping(value = "departments")
    public Department saveDepartment(@RequestBody Department department) {
       return departmentService.saveDeparment(department);

    }
    @PutMapping(value = "update-department")
    public Department updateDepartment(@RequestBody Department department) {
        return departmentService.updateDepartment(department);

    }
    @DeleteMapping(value = "delete-department/{Id}")
    public String deleteDepartment(@PathVariable("Id") Long id) {
        return departmentService.deleteDepartment(id);

    }

    @GetMapping(value = "departments/{Id}")
    public Department getDepartmentById(@PathVariable("Id") Long id) {
//       return departmentService.saveDeparment(department);

        return deparmentRepository.findById(id).get();


//        return "Department saved";
    }

   /* String sayNello(String b){
        return b+"Yay";
    }

    // "pari"
    String sayHello(String a){
       String aa= sayNello(a)+"Bay";
       return  aa;
    }*/

}
