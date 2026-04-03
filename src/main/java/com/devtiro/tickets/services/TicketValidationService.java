package com.devtiro.tickets.services;

import com.devtiro.tickets.domain.entity.TicketValidation;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface TicketValidationService {

    TicketValidation validateTicketByQrCode(UUID qrCodeId);
    TicketValidation validateTicketManually(UUID ticketId);
}
