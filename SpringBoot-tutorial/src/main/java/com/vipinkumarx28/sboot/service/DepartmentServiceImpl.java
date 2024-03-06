package com.vipinkumarx28.sboot.service;


import com.vipinkumarx28.sboot.entity.Department;
import com.vipinkumarx28.sboot.error.DepartmentNotFoundException;
import com.vipinkumarx28.sboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) throws DepartmentNotFoundException {
        Optional<Department> opt = repo.findById(id);
        if(!opt.isPresent()) {
            throw new DepartmentNotFoundException("Department not found with given id");
        }
        return opt.get();
    }

    @Override
    public List<Department> getAllDepartment() {
        return repo.findAll();
    }

    @Override 
    public void deleteDepartmentById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Department updateDepartmentById(Long id, Department department) {
        Department depDB = repo.findById(id).get();

        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(depDB.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
            !"".equalsIgnoreCase(depDB.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(depDB.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }


        return repo.save(depDB);
    }

    @Override
    public Department fetchDepatmentByName(String name) {
        return repo.findByDepartmentName(name);
    }
}
