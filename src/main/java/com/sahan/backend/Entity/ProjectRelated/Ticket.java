package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ticket
{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private long ticketID;
    private String Name;
    private Date Deadline;

    @ManyToMany
    @JoinTable(name = "user_ticket",
            joinColumns =  @JoinColumn(
                    name = "User"),
            inverseJoinColumns = @JoinColumn(
                    name = "")
    )
    private Set<User> assignedEngineersForTheTicket = new HashSet<User>();

}
