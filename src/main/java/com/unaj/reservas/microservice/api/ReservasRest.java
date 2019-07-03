package com.unaj.reservas.microservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		
		return respuesta;
	}
}
