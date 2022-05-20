package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Entity.User;
import com.sahan.backend.Repository.MicroTaskRepository;
import com.sahan.backend.Repository.ProjectRepository;
import com.sahan.backend.Repository.TaskRepository;
import com.sahan.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MicroTaskService
{
    @Autowired
    private MicroTaskRepository microTaskRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    public MicroTask saveMicroTask(MicroTask microTask)
    {
        return microTaskRepository.save(microTask);
    }

    public MicroTask createMicroTask(String name, Long taskID, Set<Long> userIDs)
    {
        Task task = taskRepository.findById(taskID).orElse(null);
        List<User> engineersToBeAssigned = userRepository.findAllById(userIDs);

        MicroTask microTask = MicroTask.builder()
                .Name(name)
                .relavantTask(task)
                .assignedEngineersForTheMicroTask(engineersToBeAssigned)
                .build();

        return microTaskRepository.save(microTask);
    }

    public MicroTask getMicroTask(Long Id)
    {
        return microTaskRepository.findById(Id).orElse(null);
    }
}
