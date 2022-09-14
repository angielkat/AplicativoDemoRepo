package com.mintic.aplicativoWeb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //crear entidades
@Table (name = "Empresas") //en plural
public class Empresa {

    @Column (nullable = false, length = 20)
    private String nombre;
    
    @Column (nullable = false, length = 20)
    private String direccion;
    
    @Column (nullable = false, length = 10)
    private int telefono;
    
    @Id
    @Column
    private Long NIT;

    public Empresa(String nombre, String direccion, int telefono, Long NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Long getNIT() {
        return NIT;
    }

    public void setNIT(Long NIT) {
        this.NIT = NIT;
    }
}
