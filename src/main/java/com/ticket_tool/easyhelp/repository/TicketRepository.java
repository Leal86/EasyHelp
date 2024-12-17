package com.ticket_tool.easyhelp.repository;

import com.ticket_tool.easyhelp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket findByIdTicket(int idTicket);
}
