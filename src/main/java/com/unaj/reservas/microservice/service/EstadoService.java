package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.dominio.Estado;

public interface EstadoService {
	
	List<Estado> getAllEstados();
	
	void createEstado (String descripcion);
}
