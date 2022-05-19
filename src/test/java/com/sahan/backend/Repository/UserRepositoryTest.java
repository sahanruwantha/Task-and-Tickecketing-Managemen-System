package com.sahan.backend.Repository;

import com.sahan.backend.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest
{
    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUser()
    {
        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);
    }
}