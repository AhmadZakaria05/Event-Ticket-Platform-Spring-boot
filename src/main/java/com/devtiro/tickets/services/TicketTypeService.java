package com.devtiro.tickets.services;

import com.devtiro.tickets.domain.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface TicketTypeService {

    Ticket purchaseTicket(UUID userId, UUID ticketTypeId);
}
