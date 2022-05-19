package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
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
                    name = "ticketID"),
            inverseJoinColumns = @JoinColumn(
                    name = "userID")
    )
    private Set<User> assignedEngineersForTheTicket = new HashSet<User>();

}
