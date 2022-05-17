package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Task
{
    @Id
    private long taskID;
    private String Name;
    private Date Deadline;
    private List<User> assignedEngineersForTheTask;
}
