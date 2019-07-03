package com.unaj.reservas.microservice.dominio;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Calificacion {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Reserva reserva;

    @NotNull
    @Min(0)
    @Max(10)
    private int valor;

    @NotNull
    private String comentario;

    public Calificacion() { }

    public Calificacion(Long id, Usuario usuario, Reserva reserva, @NotNull @Min(0) @Max(10) int valor, @NotNull String comentario) {
        this.id = id;
        this.usuario = usuario;
        this.reserva = reserva;
        this.valor = valor;
        this.comentario = comentario;
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
