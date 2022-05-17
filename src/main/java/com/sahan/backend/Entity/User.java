package com.sahan.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Entity.ProjectRelated.Ticket;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User
{

    @Id
    private Long ID;
    private String Name;
    private String Occupation;
    private String ResponsibilityInTheGroup;
    private boolean canCreateProject;
    private boolean canAssignTasksToOthers;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "assignedEngineersForTheTicket")
    private Set<Ticket> ticketsGotAssigned = new HashSet<Ticket>();
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "assignedEngineersForTheProject")
    private Set<Project> projectsGotAssigned = new HashSet<Project>();
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "assignedEngineersForTheTask")
    private Set<Task> tasksGotAssigned = new HashSet<Task>();
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "assignedEngineersForTheMicroTask")
    private Set<MicroTask> microTasksGotAssigned = new HashSet<MicroTask>();
}
