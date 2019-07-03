package com.unaj.reservas.microservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.dominio.TipoProducto;
import com.unaj.reservas.microservice.repository.ProductoRepository;
import com.unaj.reservas.microservice.repository.TipoProductoRepository;
import com.unaj.reservas.microservice.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	@Override
	public void createProducto(String descripcion, Long tipoProducto, Long estado) {
		Optional<TipoProducto> tipo = tipoProductoRepository.findById(tipoProducto);
		Producto producto = new Producto();
		producto.setDescripcion(descripcion);
		producto.setTipoProducto(tipo.get());
		productoRepository.save(producto);
	}
	
	@Override
	public List<Producto> getAllProductos() {
		return (List<Producto>) productoRepository.findAll();
	}

}
