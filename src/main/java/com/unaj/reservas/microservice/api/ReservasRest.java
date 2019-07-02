package com.unaj.reservas.microservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.dominio.Servicio;
import com.unaj.reservas.microservice.repository.ServicioRepository;
import com.unaj.reservas.microservice.response.Respuesta;

@RestController
@RequestMapping ("/reservas")
public class ReservasRest {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	@GetMapping
	public Respuesta getReservas () {
		Respuesta respuesta = new Respuesta ("OK", "Gonza deja de llorar");
		Servicio servicioPrueba = new Servicio();
		servicioPrueba.setNombre("Servicio");
		servicioPrueba.setDescripcion("Descripcion");
		servicioRepository.save(servicioPrueba);
		Iterable<Servicio> findAll = servicioRepository.findAll();
		findAll.forEach(e -> System.out.println(e.getNombre()));
		return respuesta;
	}
}
