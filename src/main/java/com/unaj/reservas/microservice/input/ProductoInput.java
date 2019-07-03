package com.unaj.reservas.microservice.input;

public class ProductoInput {
	
	private String descripcion;
	private Long tipoProducto;
	private Long estado;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(Long tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}
}
