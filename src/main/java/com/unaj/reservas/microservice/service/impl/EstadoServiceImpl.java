package com.unaj.reservas.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Estado;
import com.unaj.reservas.microservice.repository.EstadoRepository;
import com.unaj.reservas.microservice.service.EstadoService;

@Service 
public class EstadoServiceImpl implements EstadoService{
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> getAllEstados() {
		return (List<Estado>) estadoRepository.findAll();
	}

	public void createEstado(String descripcion) {
		Estado estado = new Estado();
		estado.setDescripcion(descripcion);
		estadoRepository.save(estado);
	}

}
