package com.unaj.reservas.microservice.response;

public class Respuesta {
	
	private String descripcion;
	private String codigo;
	
	public Respuesta (String codigo, String descripcion) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
