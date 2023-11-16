package com.example.tut021.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/index")
    public String getIndex() {
        return "/admin/index";
    }

    @GetMapping("/employees")
    public String getEmployees() {
        return "/admin/employees";
    }

    @GetMapping("/article")
    public String getArticle() {
        return "/admin/article";
    }
}
