package com.example.departmentService.controller;

import com.example.departmentService.entity.Department;
import com.example.departmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController class");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/")
    public List<Department> getAllDepartment(){
        log.info("Inside getAllDepartment method of DepartmentController class");
        return departmentService.getAllDepartment();
    }


    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside getDepartmentById method of DepartmentController class");
        return departmentService.getDepartmentById(departmentId);
    }

}
