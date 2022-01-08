package com.example.demo.controllers;

import com.example.demo.repos.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    EmployeeRepository userRepository;
    @GetMapping("/")
    public String displayHome(Model model){
        return "home";
    }
}
