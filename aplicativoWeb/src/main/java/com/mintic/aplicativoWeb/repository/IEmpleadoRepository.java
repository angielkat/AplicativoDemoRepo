package com.mintic.aplicativoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mintic.aplicativoWeb.entidades.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>{
	
	/*@Query("SELECT EMP FROM Empleados EMP")
	public List<Empleado> findAllEmpleados();*/
}
