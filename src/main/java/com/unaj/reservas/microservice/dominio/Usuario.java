package com.unaj.reservas.microservice.dominio;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String email;

    @OneToMany
    @JoinColumn(name="usuario_id")
    private List<Reserva> reservas;

    public Usuario() { }

    public Usuario(Long id, @NotNull String nombre, @NotNull String email, List<Reserva> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.reservas = reservas;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
