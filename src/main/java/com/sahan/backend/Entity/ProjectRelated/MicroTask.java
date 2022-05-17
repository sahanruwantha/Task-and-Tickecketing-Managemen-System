package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class MicroTask
{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long microTaskID;
    private String Name;
    private Date Deadline;
    @ManyToMany
    @JoinTable(name = "user_microTask",
            joinColumns =  @JoinColumn(
                    name = "microTaskID"),
            inverseJoinColumns = @JoinColumn(
                    name = "userID")
    )
    private List<User> assignedEngineersForTheMicroTask;
}
