package com.mintic.aplicativoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.aplicativoWeb.json.EmpleadoRest;
import com.mintic.aplicativoWeb.response.FinanzasResponses;
import com.mintic.aplicativoWeb.services.IEmpleadoServices;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "/finanzas" + "/v1")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoServices empleadoServices;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "createReservation",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public  FinanzasResponses<String> createReservation(@RequestBody EmpleadoRest createEmpleado) throws Exception {		
		return new FinanzasResponses<>("Succes", String.valueOf(HttpStatus.OK), "OK", empleadoServices.crearUsuario(createEmpleado));
	}	

}
