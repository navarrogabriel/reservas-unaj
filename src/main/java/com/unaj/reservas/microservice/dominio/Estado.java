package com.unaj.reservas.microservice.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Estado {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name="estado_id")
    private List<Producto> productos;

    @NotNull
    private String descripcion;

    public Estado() { }

    public Estado(Long id, List<Producto> productos, @NotNull String descripcion) {
        this.id = id;
        this.productos = productos;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
