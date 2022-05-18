package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    private Project saveProject(Project project)
    {
        return projectRepository.save(project);
    }

    private Project getProject(Long projectID)
    {
        return projectRepository.findById(projectID).orElse(null);
    }

    private List<Project> getProjects()
    {
        return projectRepository.findAll();
    }
}
