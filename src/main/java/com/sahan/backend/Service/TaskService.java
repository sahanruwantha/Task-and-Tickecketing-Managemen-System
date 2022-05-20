package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(String name)
    {
        return taskRepository.save(task);
    }
}
