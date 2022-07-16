package com.claudiathalita.services;

import org.springframework.mail.SimpleMailMessage;

import com.claudiathalita.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
