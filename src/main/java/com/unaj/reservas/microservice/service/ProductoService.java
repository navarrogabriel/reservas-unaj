package com.unaj.reservas.microservice.service;

import java.util.List;

import com.unaj.reservas.microservice.exception.EstadoNotFoundException;
import com.unaj.reservas.microservice.exception.TipoProductoNotFoundException;
import com.unaj.reservas.microservice.response.ProductosResponse;

public interface ProductoService {
	
	List<ProductosResponse> getAllProductos();
	
	void createProducto (String descripcion, Long tipoProducto, Long estado) throws TipoProductoNotFoundException, EstadoNotFoundException ;
}
