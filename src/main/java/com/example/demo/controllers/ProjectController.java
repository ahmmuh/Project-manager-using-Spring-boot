package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repos.EmployeeRepository;
import com.example.demo.repos.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/all")
    public String displayProjects(Model model){
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projectList",projects);
        return "project_list";
    }
    @GetMapping("/projectForm")
    public String displayProjectForm(Model model){
        List<Employee> employees = employeeRepository.findAll();
        Project project = new Project();
        model.addAttribute("project",project);
        model.addAttribute("allEmployees",employees);
        return "new_project";
    }


    @PostMapping("/create")
    public String createProjecte(Project project,Model model){
        projectRepository.save(project);
        System.out.println("*********************AHMED*************************");
        System.out.println(project);
        return "home";
    }
}
