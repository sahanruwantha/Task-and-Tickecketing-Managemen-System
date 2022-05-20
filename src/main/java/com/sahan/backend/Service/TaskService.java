package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Repository.ProjectRepository;
import com.sahan.backend.Repository.TaskRepository;
import com.sahan.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public Task createNewTask(String name, Long projectID, Set<Long> userIDs)
    {
        Project project = projectRepository.findById(projectID).orElse(null);
        return taskRepository.save(task);
    }
}
