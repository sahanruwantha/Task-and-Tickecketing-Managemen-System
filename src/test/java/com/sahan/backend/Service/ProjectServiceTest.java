package com.sahan.backend.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceTest
{
    @Autowired
    private ProjectService projectService;

    @Test
    public void addNewProject()
    {
        Set<Long> userIDs = new HashSet<Long>();
        userIDs.add(1L);
        projectService.addNewProject("new", userIDs);
    }
}