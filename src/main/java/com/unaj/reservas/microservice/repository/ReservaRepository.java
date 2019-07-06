package com.unaj.reservas.microservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.reservas.microservice.dominio.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long> {
	
	@Query(
			  value = "SELECT * FROM RESERVA r WHERE r.usuario_id = :idUsuario", 
			  nativeQuery = true)
	List<Reserva> findByIdUsuario(@Param("idUsuario") Long idUsuario);

}
