package com.unaj.reservas.microservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.exception.ProductoNotFoundException;
import com.unaj.reservas.microservice.exception.UsuarioNotFoundException;
import com.unaj.reservas.microservice.input.ReservaInput;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservasRest {

	@Autowired
	private ReservaService reservaService;

	@GetMapping
	public Respuesta getReservas() {
		Respuesta respuesta = new Respuesta("OK", "Gonza deja de llorar");

		return respuesta;
	}

	@PostMapping("/alta")
	public Respuesta crearReserva(@RequestBody ReservaInput reservaInput) {
		try {
			reservaService.createReserva(reservaInput.getIdProducto(), reservaInput.getIdUsuario(),
					reservaInput.getFechaInicio(), reservaInput.getFechaFin());
		} catch (Exception e) {
			return new Respuesta("ERROR", "Error al crear reserva");
		}
		Respuesta respuesta = new Respuesta("OK", "Reserva creada");

		return respuesta;
	}
}
