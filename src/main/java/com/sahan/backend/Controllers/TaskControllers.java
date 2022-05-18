package com.sahan.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskControllers
{
    @GetMapping("/tasks")
    public String getTasks()
    {
        return "hi from tasks";
    }
}
