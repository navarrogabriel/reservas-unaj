package com.unaj.reservas.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unaj.reservas.microservice.dominio.Calificacion;

public interface CalificacionRepository extends CrudRepository<Calificacion, Long> {

}
