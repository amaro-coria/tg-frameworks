package net.tecgurus.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable {
	
	private Integer idCliente;
	private Integer idBanco;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private Integer edad;

}
