package com.unaj.reservas.microservice.service;

import java.time.LocalDate;
import java.util.List;

import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.exception.ProductoNotFoundException;
import com.unaj.reservas.microservice.exception.UsuarioNotFoundException;
import com.unaj.reservas.microservice.response.ReservasResponse;

public interface ReservaService {
	
	List<Reserva> getAllReservas();	
	
	List<ReservasResponse> getAllReservasByUsuario(Long idUsuario);
	
	void createReserva(Long idProducto, Long idUsuario, LocalDate fechaInicio, LocalDate fechaFin)
			throws UsuarioNotFoundException, ProductoNotFoundException;
}
