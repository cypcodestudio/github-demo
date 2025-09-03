package com.cypcode.github_demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class HomeController {

    @PostMapping
    public String create() {
        return "Create API not yet implemented";
    }

    @GetMapping
    public String retrieve() {
        return "Get API not yet implemented";
    }

    @PutMapping
    public String update() {
        return "Update API not yet implemented";
    }

    @DeleteMapping
    public String delete() {
        return "Delete API not yet implemented";
    }

}
