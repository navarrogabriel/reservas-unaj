package com.unaj.reservas.microservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.dominio.Usuario;

public interface ReservaRepository extends CrudRepository<Reserva, Long> {

	List<Reserva> findByUsuario(Usuario usuario);

}
