package com.unaj.reservas.microservice.response;

public class ProductosResponse {
	
	private String descripcion;
	private Long idProducto;
	private Long idTipoProducto;
	private Long idEstado;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public Long getIdTipoProducto() {
		return idTipoProducto;
	}
	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
}
