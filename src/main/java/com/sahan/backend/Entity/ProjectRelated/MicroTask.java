package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MicroTask
{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long microTaskID;

    @ManyToOne
    @JoinColumn(name = "projectID")
    private Project relavantProject;
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
