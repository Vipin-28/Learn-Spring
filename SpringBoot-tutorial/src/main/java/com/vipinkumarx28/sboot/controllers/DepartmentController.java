package com.vipinkumarx28.sboot.controllers;

import com.vipinkumarx28.sboot.entity.Department;

import com.vipinkumarx28.sboot.error.DepartmentNotFoundException;
import com.vipinkumarx28.sboot.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/add")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("save department api is called.");
         return service.saveDepartment(department);
    }

    @GetMapping("/getAll")
    public List<Department> getAllDepartments(){
        return service.getAllDepartment();
    }

    @GetMapping("/get/{id}")
    public Department getDepartment(@PathVariable("id") Long id) throws DepartmentNotFoundException { // to be more specific use "id"
        return service.getDepartmentById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable Long id){
        service.deleteDepartmentById(id);
        return "Department deleted sucdessfully.";
    }

    @PutMapping("/update/{id}")
    public Department UpdateDepartment(@PathVariable("id") Long id, @RequestBody Department department){
        return service.updateDepartmentById(id, department);
    }

    @GetMapping("/get/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String name){
        return service.fetchDepatmentByName(name);
    }
}
