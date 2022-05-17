package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private List<User> assignedEngineersForTheProject;
}
