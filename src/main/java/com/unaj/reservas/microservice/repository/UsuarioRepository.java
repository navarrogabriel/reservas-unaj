package com.unaj.reservas.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unaj.reservas.microservice.dominio.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
