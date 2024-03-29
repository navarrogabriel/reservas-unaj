package com.unaj.reservas.microservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Usuario;
import com.unaj.reservas.microservice.repository.UsuarioRepository;
import com.unaj.reservas.microservice.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> getAllUsuarios() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

	public void createUsuario(String nombre, String email) {
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setNombre(nombre);
		usuarioRepository.save(usuario);
	}

	public Optional<Usuario> findUsuarioById(Long id) {
		return usuarioRepository.findById(id);
	}

	public void modificarUsuario(Usuario usuario) {
		// TO DO
	}

	public void eliminarUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

}
