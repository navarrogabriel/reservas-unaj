package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.dominio.Servicio;

public interface ServicioService {
	
	List<Servicio> getAllServicios();
	
	void createServicio (Servicio servicio);
}
