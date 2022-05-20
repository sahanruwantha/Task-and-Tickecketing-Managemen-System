package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(String name, Long taskID, Set<Long> userIDs)
    {
        return taskRepository.save(task);
    }
}
