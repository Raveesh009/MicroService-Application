package com.example.departmentService.service;

import com.example.departmentService.entity.Department;
import com.example.departmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService class");
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment() {
        log.info("Inside getAllDepartment method of DepartmentService class");
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Inside getDepartmentById method of DepartmentService class");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
