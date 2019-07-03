package com.unaj.reservas.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unaj.reservas.microservice.dominio.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
