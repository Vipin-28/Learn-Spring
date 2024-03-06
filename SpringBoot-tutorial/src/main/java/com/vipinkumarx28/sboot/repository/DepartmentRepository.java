package com.vipinkumarx28.sboot.repository;

import com.vipinkumarx28.sboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String name);
}
