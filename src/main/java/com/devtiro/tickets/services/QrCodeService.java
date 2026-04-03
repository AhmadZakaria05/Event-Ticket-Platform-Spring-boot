package com.devtiro.tickets.services;

import com.devtiro.tickets.domain.entity.QrCode;
import com.devtiro.tickets.domain.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);

    byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}
