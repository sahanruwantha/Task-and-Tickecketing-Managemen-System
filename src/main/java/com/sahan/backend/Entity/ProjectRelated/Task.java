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
@Proxy(lazy=false)
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
