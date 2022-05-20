package com.sahan.backend.Entity;

import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import com.sahan.backend.Entity.ProjectRelated.Project;
import com.sahan.backend.Entity.ProjectRelated.Task;
import com.sahan.backend.Entity.ProjectRelated.Ticket;
import lombok.*;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User
{

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long userID;
    private String Name;
    private String Occupation;
    private String ResponsibilityInTheGroup;
    private boolean canCreateProject;
    private boolean canAssignTasksToOthers;

    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "assignedEngineersForTheTicket")
    private Set<Ticket> ticketsGotAssigned = new HashSet<Ticket>();
    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "assignedEngineersForTheProject")
    private Set<Project> projectsGotAssigned = new HashSet<Project>();
    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "assignedEngineersForTheTask")
    private Set<Task> tasksGotAssigned = new HashSet<Task>();
    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "assignedEngineersForTheMicroTask")
    private Set<MicroTask> microTasksGotAssigned = new HashSet<MicroTask>();


}
