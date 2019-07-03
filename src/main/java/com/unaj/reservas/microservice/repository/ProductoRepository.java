package com.unaj.reservas.microservice.repository;

import com.unaj.reservas.microservice.dominio.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
