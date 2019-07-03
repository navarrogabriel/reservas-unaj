package com.unaj.reservas.microservice.repository;

import com.unaj.reservas.microservice.dominio.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface ReservaRepository extends CrudRepository<Reserva, Long> {

}
