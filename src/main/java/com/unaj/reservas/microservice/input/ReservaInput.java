package com.unaj.reservas.microservice.input;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReservaInput {
	
	private Long idProducto;
	private Long idUsuario;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaInicio;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaFin;
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
}
