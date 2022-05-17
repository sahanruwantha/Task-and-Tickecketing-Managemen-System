package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Project
{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long projectID;
    private String Name;
    private Date Deadline;
    @ManyToMany
    @JoinTable(name = "user_project",
            joinColumns =  @JoinColumn(
                    name = "projectID"),
            inverseJoinColumns = @JoinColumn(
                    name = "userID")
    )
    private List<User> assignedEngineersForTheProject;
}
