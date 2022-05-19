package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.User;
import com.sahan.backend.Repository.ProjectRepository;
import com.sahan.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class ProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

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

    public void addNewProject(String projectName, Set<Long> userIDs)
    {
        List<User> engineersToBeAssigned = userRepository.findAllById(userIDs);
        Project project = Project.builder().Name(projectName).build();
        project.assignEngineer(engineersToBeAssigned);
        projectRepository.save(project);
    }
}
