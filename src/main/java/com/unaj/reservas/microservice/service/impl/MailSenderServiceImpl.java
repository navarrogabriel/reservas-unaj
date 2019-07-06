package com.unaj.reservas.microservice.service.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.unaj.reservas.microservice.dominio.Usuario;
import com.unaj.reservas.microservice.repository.UsuarioRepository;
import com.unaj.reservas.microservice.service.MailSenderService;

public class MailSenderServiceImpl implements MailSenderService{
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void sendEmail(long id, String subject, String text) {
		Optional<Usuario> findById = usuarioRepository.findById(id);
		String email = findById.get().getEmail();
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);
        msg.setSubject(subject);
        msg.setText(text);
        javaMailSender.send(msg);

    }
}