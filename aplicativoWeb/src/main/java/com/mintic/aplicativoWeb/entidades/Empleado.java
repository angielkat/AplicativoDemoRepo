package com.mintic.aplicativoWeb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Empleados")
public class Empleado {

    @Id
    @Column
    private Long documento;
    
    @Column (nullable = false, length = 30)
    private String nombreEmpleado;
    
    @Column (nullable = false, length = 20)
    private String correo;
    
    @ManyToOne
    @JoinColumn (name="id_empresa")
    private Empresa empresa;
    
    @Column (nullable = false, length = 30)
    private String rol;

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
