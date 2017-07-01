package net.tecgurus.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebServiceTest {
	
	@WebMethod
	public String saluda(String name) {
		return "Hola: "+name;
	}
	
	@WebMethod
	public MiDTO obtenEjemplo(Integer i) {
		MiDTO dto = new MiDTO();
		dto.setLastName("Amaro");
		dto.setName("Jorge");
		return dto;
	}
	

}
