package com.unaj.reservas.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.dominio.Servicio;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.ServicioService;

@RestController
@RequestMapping ("/reservas")
public class ReservasRest {
	
	@Autowired
	private ServicioService servicioService;
	
	@GetMapping
	public Respuesta getReservas () {
		Respuesta respuesta = new Respuesta ("OK", "Gonza deja de llorar");
		Servicio servicioPrueba = new Servicio();
		servicioPrueba.setNombre("Servicio");
		servicioPrueba.setDescripcion("Descripcion");
		servicioService.createServicio(servicioPrueba);
		List<Servicio> allServicios = servicioService.getAllServicios();
		allServicios.forEach(e -> System.out.println(e.getNombre()));
		return respuesta;
	}
}
