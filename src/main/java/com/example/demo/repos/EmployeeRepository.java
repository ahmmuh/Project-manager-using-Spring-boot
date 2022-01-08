package com.example.demo.repos;

import com.example.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    public List<Employee> findAll();
}
