package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/all")
    public String showEmployees(Model model){
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees",employees);
        return "employee_list";
    }

    @GetMapping("/employeeForm")
    public String displayEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new_employee";
    }


    @PostMapping("/create")
    public String addEmployee(Model model, Employee employee){
        employeeRepository.save(employee);
        return "home";
    }
}
