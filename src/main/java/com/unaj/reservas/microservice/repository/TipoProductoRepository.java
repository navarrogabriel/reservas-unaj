package com.unaj.reservas.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unaj.reservas.microservice.dominio.TipoProducto;

public interface TipoProductoRepository extends CrudRepository<TipoProducto, Long> {

}
