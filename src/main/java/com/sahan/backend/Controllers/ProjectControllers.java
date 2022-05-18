package com.sahan.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectControllers
{
    @GetMapping("/projects")
    public String getProjects()
    {
        return "hi from projects";
    }
}
