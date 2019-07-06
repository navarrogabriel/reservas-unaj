package com.unaj.reservas.microservice.service;

public interface MailSenderService {

	void sendEmail(long id_usuario, long id_producto);
}
