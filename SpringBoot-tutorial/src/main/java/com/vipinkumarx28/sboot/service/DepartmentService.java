package com.vipinkumarx28.sboot.service;

import com.vipinkumarx28.sboot.entity.Department;
import com.vipinkumarx28.sboot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public Department getDepartmentById(Long id) throws DepartmentNotFoundException;

    List<Department> getAllDepartment();

    void deleteDepartmentById(Long id);

    Department updateDepartmentById(Long id, Department department);

    Department fetchDepatmentByName(String name);
}
