package com.unaj.reservas.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.dominio.Usuario;
import com.unaj.reservas.microservice.repository.ReservaRepository;
import com.unaj.reservas.microservice.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	public List<Reserva> getAllReservas() {
		return (List<Reserva>) reservaRepository.findAll();
	}

	public List<Reserva> getAllReservasByUsuario(Usuario usuario) {
		return reservaRepository.findByUsuario(usuario);
	}

	public void createReserva(Producto producto, Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
