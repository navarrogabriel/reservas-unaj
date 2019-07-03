package com.unaj.reservas.microservice.repository;

import com.unaj.reservas.microservice.dominio.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
