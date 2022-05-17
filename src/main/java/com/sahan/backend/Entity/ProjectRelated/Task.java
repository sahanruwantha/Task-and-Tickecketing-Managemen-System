package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Task
{
    @Id
    private long taskID;
    private String Name;
    private Date Deadline;
    @ManyToMany
    @JoinTable(name = "user_task",
            joinColumns =  @JoinColumn(
                    name = "taskID"),
            inverseJoinColumns = @JoinColumn(
                    name = "userID")
    )
    private List<User> assignedEngineersForTheTask;
}
