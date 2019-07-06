package com.unaj.reservas.microservice.service;

import java.time.LocalDate;
import java.util.List;

import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.exception.ProductoNotFoundException;
import com.unaj.reservas.microservice.exception.UsuarioNotFoundException;

public interface ReservaService {
	
	List<Reserva> getAllReservas();	
	
	List<Reserva> getAllReservasByUsuario(Long idUsuario);
	
	void createReserva(Long idProducto, Long idUsuario, LocalDate fechaInicio, LocalDate fechaFin)
			throws UsuarioNotFoundException, ProductoNotFoundException;
}
