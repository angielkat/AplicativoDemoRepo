package com.mintic.aplicativoWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.aplicativoWeb.entidades.Empleado;
import com.mintic.aplicativoWeb.entidades.Empresa;
import com.mintic.aplicativoWeb.json.EmpleadoRest;
import com.mintic.aplicativoWeb.repository.IEmpleadoRepository;
import com.mintic.aplicativoWeb.repository.IEmpresaRepository;

@Service
public class EmpleadoServices implements IEmpleadoServices {
	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Autowired
	private IEmpresaRepository empresaRepository;

	@Override
	public String crearUsuario(EmpleadoRest empleado) {
		
		Empleado empleadoEntitie = new Empleado();
		
		
		if ( empleado != null && empleado instanceof EmpleadoRest ) {
			
			empleadoEntitie.setDocumento(empleado.getDocumento());
			empleadoEntitie.setCorreo(empleado.getCorreo());			
			Empresa emp = new Empresa(); //empresaRepository.getReferenceById(empleado.getEmpresa());			
			emp.setNIT(1l);
			emp.setDireccion("calle");
			emp.setTelefono(123124);
			emp.setNombre("Empresa");
			empleadoEntitie.setEmpresa(emp);
			empleadoEntitie.setNombreEmpleado(empleado.getNombreEmpleado());
			empleadoEntitie.setRol(empleado.getRol());
			
			empleadoRepository.save(empleadoEntitie);
			
			return "OK";
			
		}
		
		return "FAILD";
	}

}
