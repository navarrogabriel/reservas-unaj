package com.unaj.reservas.microservice.service.impl;
import java.util.Optional;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.unaj.reservas.microservice.dominio.Usuario;
import com.unaj.reservas.microservice.repository.UsuarioRepository;
import com.unaj.reservas.microservice.service.MailSenderService;
import org.springframework.stereotype.Service;

@Service
public class MailSenderServiceImpl implements MailSenderService{
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

    @Autowired
    private ProductoRepository productoRepository;
	
	public void sendEmail(long id_usuario, long id_producto) {
		Optional<Usuario> usuario = usuarioRepository.findById(id_usuario);
        Optional<Producto> producto = productoRepository.findById(id_producto);
        String nombre = usuario.get().getNombre();
        String email = usuario.get().getEmail();
        String descripcionProducto = producto.get().getDescripcion();
        SimpleMailMessage msg = new SimpleMailMessage();
        String text = nombre + " hemos registrado correctamente la reserva del siguiente producto: " + descripcionProducto + ". Muchas gracias";
        msg.setTo(email);
        msg.setSubject("Reserva efectuada correctamente");
        msg.setText(text);
        javaMailSender.send(msg);

    }
}