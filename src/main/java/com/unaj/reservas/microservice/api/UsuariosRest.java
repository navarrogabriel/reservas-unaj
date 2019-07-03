package com.unaj.reservas.microservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.input.UsuarioInput;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuariosRest {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/nuevo")
	public Respuesta crearUsuario(@RequestBody UsuarioInput usuarioInput) {
		usuarioService.createUsuario(usuarioInput.getNombre(), usuarioInput.getEmail());
		Respuesta respuesta = new Respuesta("OK", "Usuario creado");
		return respuesta;
	}
}
