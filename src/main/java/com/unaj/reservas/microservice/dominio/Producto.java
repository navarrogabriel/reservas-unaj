package com.unaj.reservas.microservice.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Producto {

	@Id
    @GeneratedValue
    private Long id;
	
 	@ManyToOne
 	private TipoProducto tipoProducto;

	@ManyToOne
	private Estado estado;

	@NotNull
	private String descripcion;

	public Producto() { }

	private Producto(Long id, TipoProducto tipoProducto, Estado estado, @NotNull String descripcion) {
		this.id = id;
		this.tipoProducto = tipoProducto;
		this.estado = estado;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
