package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.dominio.Producto;

public interface ProductoService {
	
	List<Producto> getAllServicios();
	
	void createServicio (Producto producto);
}
