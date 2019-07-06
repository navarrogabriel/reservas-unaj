package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.exception.EstadoNotFoundException;
import com.unaj.reservas.microservice.exception.TipoProductoNotFoundException;

public interface ProductoService {
	
	List<Producto> getAllProductos();
	
	void createProducto (String descripcion, Long tipoProducto, Long estado) throws TipoProductoNotFoundException, EstadoNotFoundException ;
}
