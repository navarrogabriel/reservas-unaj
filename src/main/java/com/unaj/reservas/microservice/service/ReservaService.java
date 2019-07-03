package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.dominio.Usuario;

public interface ReservaService {
	
	List<Reserva> getAllReservas();	
	
	List<Reserva> getAllReservasByUsuario(Usuario usuario);
	
	void createReserva (Producto producto, Usuario usuario);
}
