package com.mintic.aplicativoWeb.entidades;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name ="MOVIMIENTO_DINERO")
public class MovimientoDinero {
	
	@Id
	@Column
	private int id;

    @Column
    private int montoMovimiento;
    
    @Column
    private String concepto;
    
    @Column
    private Date fechaMovimiento;

    @ManyToOne
        @JoinColumn(name="documento")
    private Empleado empl;
    
    @ManyToOne
        @JoinColumn (name="nit")
    private Empresa nitEmpre;

    public MovimientoDinero() {
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

	public Empleado getEmpl() {
		return empl;
	}

	public void setEmpl(Empleado empl) {
		this.empl = empl;
	}

	public Empresa getNitEmpre() {
		return nitEmpre;
	}

	public void setNitEmpre(Empresa nitEmpre) {
		this.nitEmpre = nitEmpre;
	}

	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}   
	
	
    
}
