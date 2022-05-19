package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;
import lombok.*;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project
{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long projectID;
    private String Name;
    private Date Deadline;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_project",
            joinColumns =  @JoinColumn(
                    name = "projectID"),
            inverseJoinColumns = @JoinColumn(
                    name = "userID")
    )

    private Set<User> assignedEngineersForTheProject;

    @OneToMany(mappedBy = "relavantProject")
    private Set<MicroTask> microTasks;
    public void assignEngineer(List<User> user)
    {
        if (assignedEngineersForTheProject == null)
        {
            assignedEngineersForTheProject = new HashSet<User>();
        }

        assignedEngineersForTheProject.addAll(user);
    }
}
