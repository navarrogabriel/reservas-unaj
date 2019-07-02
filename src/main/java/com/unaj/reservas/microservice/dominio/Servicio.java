package com.unaj.reservas.microservice.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="SERVICIO")
public class Servicio {

	@Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
	
	@Column (name="NOMBRE", nullable = false)
	private String nombre;
	
	@Column (name="DESCRIPCION", nullable = false)
	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
