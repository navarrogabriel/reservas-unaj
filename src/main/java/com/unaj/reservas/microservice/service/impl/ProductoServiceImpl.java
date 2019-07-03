package com.unaj.reservas.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.repository.ProductoRepository;
import com.unaj.reservas.microservice.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> getAllServicios() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public void createServicio(Producto producto) {
		productoRepository.save(producto);
	}

}
