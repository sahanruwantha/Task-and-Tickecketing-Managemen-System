package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.User;
import com.sahan.backend.Repository.MicroTaskRepository;
import com.sahan.backend.Repository.ProjectRepository;
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
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    public MicroTask saveMicroTask(MicroTask microTask)
    {
        return microTaskRepository.save(microTask);
    }

    public void createMicroTask(String name, Long projectID, Set<Long> userIDs)
    {
        Project project = projectRepository.findById(projectID).orElse(null);
        List<User> engineersToBeAssigned = userRepository.findAllById(userIDs);

        MicroTask microTask = MicroTask.builder()
                .Name(name)
                .relavantProject(project)
                .assignedEngineersForTheMicroTask(engineersToBeAssigned)
                .build();
    }

    public MicroTask getMicroTask(Long Id)
    {
        return microTaskRepository.findById(Id).orElse(null);
    }
}
