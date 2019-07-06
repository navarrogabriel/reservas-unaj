package com.unaj.reservas.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Estado;
import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.dominio.TipoProducto;
import com.unaj.reservas.microservice.exception.EstadoNotFoundException;
import com.unaj.reservas.microservice.exception.TipoProductoNotFoundException;
import com.unaj.reservas.microservice.repository.EstadoRepository;
import com.unaj.reservas.microservice.repository.ProductoRepository;
import com.unaj.reservas.microservice.repository.TipoProductoRepository;
import com.unaj.reservas.microservice.response.ProductosResponse;
import com.unaj.reservas.microservice.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Autowired
	private TipoProductoRepository tipoProductoRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	public void createProducto(String descripcion, Long tipoProducto, Long estadoId)
			throws TipoProductoNotFoundException, EstadoNotFoundException {
		Optional<TipoProducto> tipo = tipoProductoRepository.findById(tipoProducto);
		if (tipo.isEmpty()) {
			throw new TipoProductoNotFoundException();
		}

		Optional<Estado> estado = estadoRepository.findById(estadoId);
		if (estado.isEmpty()) {
			throw new EstadoNotFoundException();
		}

		Producto producto = new Producto();
		producto.setDescripcion(descripcion);
		producto.setTipoProducto(tipo.get());
		producto.setEstado(estado.get());
		productoRepository.save(producto);
	}

	public List<ProductosResponse> getAllProductos() {
		List<Producto> productos = (List<Producto>) productoRepository.findAll();
		List<ProductosResponse> productoResponse = new ArrayList<>();
		ProductosResponse response = null;
		for (Producto producto : productos) {
			response = new ProductosResponse();
			response.setDescripcion(producto.getDescripcion());
			response.setIdEstado(producto.getEstado().getId());
			response.setIdProducto(producto.getId());
			response.setIdTipoProducto(producto.getTipoProducto().getId());
			productoResponse.add(response);
		}
		
		return productoResponse;
	}

}
