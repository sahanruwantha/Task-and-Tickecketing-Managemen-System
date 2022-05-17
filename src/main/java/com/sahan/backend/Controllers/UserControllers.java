package com.sahan.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllers
{
    @GetMapping("/users")
    public String getUsers()
    {
        return "hi from users";
    }
}
