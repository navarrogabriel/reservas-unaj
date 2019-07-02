package com.unaj.reservas.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Servicio;
import com.unaj.reservas.microservice.repository.ServicioRepository;
import com.unaj.reservas.microservice.service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	@Override
	public List<Servicio> getAllServicios() {
		return (List<Servicio>) servicioRepository.findAll();
	}

	@Override
	public void createServicio(Servicio servicio) {
		servicioRepository.save(servicio);
	}

}
