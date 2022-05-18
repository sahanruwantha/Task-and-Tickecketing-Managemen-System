package com.sahan.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroTaskController
{
    @GetMapping("/microtasks")
    public String getMicroTasks()
    {
        return "hi from microtasks";
    }
}
