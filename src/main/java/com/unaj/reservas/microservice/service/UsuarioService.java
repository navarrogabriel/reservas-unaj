package com.unaj.reservas.microservice.service;

import java.util.List;
import java.util.Optional;

import com.unaj.reservas.microservice.dominio.Usuario;

public interface UsuarioService {
	
	List<Usuario> getAllUsuarios ();
	
	void createUsuario (String nombre, String email);
	
	Optional<Usuario> findUsuarioById (Long id);
	
	void modificarUsuario (Usuario usuario);
	
	void eliminarUsuario (Usuario usuario);
}
