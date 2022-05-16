package com.sahan.backend.Entity.ProjectRelated;

import com.sahan.backend.Entity.User;

import java.util.Date;
import java.util.List;

public class Ticket
{
    private long ID;
    private String Name;
    private Date Deadline;
    private List<User> assignedEngineers;

}
