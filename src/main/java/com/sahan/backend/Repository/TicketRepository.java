package com.sahan.backend.Repository;

import com.sahan.backend.Entity.ProjectRelated.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
