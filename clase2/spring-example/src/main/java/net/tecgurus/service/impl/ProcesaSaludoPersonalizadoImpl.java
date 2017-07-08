package net.tecgurus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.service.HelloWorldService;
import net.tecgurus.service.ProcesaSaludo;

@Component
public class ProcesaSaludoPersonalizadoImpl implements ProcesaSaludo {

	@Autowired
	private HelloWorldService servicioBase;
	private String nombreOutput;
	
	@Override
	public String saludoPersonalizado() {
		return servicioBase.hello() + " Jorge Amaro";
	}
	
	public void setServicioBase(HelloWorldService servicioBase) {
		this.servicioBase = servicioBase;
	}
	
	public void setNombreOutput(String nombreOutput) {
		this.nombreOutput = nombreOutput;
	}
	

}
