package com.unaj.reservas.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.ProductoService;

@RestController
@RequestMapping ("/reservas")
public class ReservasRest {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public Respuesta getReservas () {
		Respuesta respuesta = new Respuesta ("OK", "Gonza deja de llorar");
		Producto productoPrueba = new Producto();
		//productoPrueba.setNombre("Producto");
		productoPrueba.setDescripcion("Descripcion");
		productoService.createServicio(productoPrueba);
		List<Producto> allProductos = productoService.getAllServicios();
		//allProductos.forEach(e -> System.out.println(e.getNombre()));
		return respuesta;
	}
}
