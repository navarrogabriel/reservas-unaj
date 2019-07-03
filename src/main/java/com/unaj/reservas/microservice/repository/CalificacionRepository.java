package com.unaj.reservas.microservice.repository;

import com.unaj.reservas.microservice.dominio.Calificacion;
import org.springframework.data.repository.CrudRepository;

public interface CalificacionRepository extends CrudRepository<Calificacion, Long> {

}
