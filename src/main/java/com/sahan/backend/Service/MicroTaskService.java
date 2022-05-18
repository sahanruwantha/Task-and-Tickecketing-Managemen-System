package com.sahan.backend.Service;

import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import com.sahan.backend.Repository.MicroTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class MicroTaskService
{
    private MicroTaskRepository microTaskRepository;

    public MicroTask saveMicroTask(MicroTask microTask)
    {
        return microTaskRepository.save(microTask);
    }
}
