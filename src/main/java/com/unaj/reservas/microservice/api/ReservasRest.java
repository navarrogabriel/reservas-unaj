package com.unaj.reservas.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.input.ReservaInput;
import com.unaj.reservas.microservice.response.ReservasResponse;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.MailSenderService;
import com.unaj.reservas.microservice.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservasRest {

	@Autowired
	private ReservaService reservaService;
	
	@Autowired
	private MailSenderService mailSenderService;

	@GetMapping
	public Respuesta getReservas() {
		Respuesta respuesta = new Respuesta("OK", "asd");

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
		mailSenderService.sendEmail(reservaInput.getIdUsuario(), reservaInput.getIdProducto());
		return respuesta;
	}
	
	@GetMapping ("/{idUsuario}")
	public List<ReservasResponse> getReservasByIdUsuario(@PathVariable ("idUsuario") String idUsuario){
		return reservaService.getAllReservasByUsuario(Long.valueOf(idUsuario));
	}
}
