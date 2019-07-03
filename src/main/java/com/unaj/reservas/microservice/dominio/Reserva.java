package com.unaj.reservas.microservice.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Reserva {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Producto producto;

    @NotNull
    private String codigo;

    @NotNull
    private Date fechaInicio;

    @NotNull
    private Date fechaFin;

    public Reserva() { }

    public Reserva(Long id, Usuario usuario, Producto producto, @NotNull String codigo, @NotNull Date fechaInicio, @NotNull Date fechaFin) {
        this.id = id;
        this.usuario = usuario;
        this.producto = producto;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
