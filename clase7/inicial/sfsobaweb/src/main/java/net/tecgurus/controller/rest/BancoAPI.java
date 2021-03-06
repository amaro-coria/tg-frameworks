package net.tecgurus.controller.rest;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.dto.ClienteDTO;
import net.tecgurus.exception.TGServiceException;
import net.tecgurus.service.BancoService;
import net.tecgurus.service.ClienteService;
import net.tecgurus.util.CustomSpringContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
@Path("/api")
public class BancoAPI {

	private static final Logger log = LoggerFactory.getLogger(BancoAPI.class);

	private BancoService bancoService;
	private ClienteService clienteService;

	@GET
	@Path("/bancos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findBancos() {
		List<BancoDTO> responseList;
		try {
			responseList = getBancoService().getAll();
		} catch (TGServiceException e) {
			log.error("Error en rest: {}", e.getMessage());
			responseList = new ArrayList<>();
		}
		return Response.status(200).entity(responseList).build();
	}

	@GET
	@Path("/clientes")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findClientes() {
		List<ClienteDTO> listRespose;
		try {
			listRespose = getClienteService().getAll();
		} catch (TGServiceException e) {
			log.error("Error en rest: {}", e.getMessage());
			listRespose = new ArrayList<>();
		}
		return Response.status(200).entity(listRespose).build();
	}

	private BancoService getBancoService() {
		if (bancoService == null) {
			bancoService = CustomSpringContext.getBancoServiceBean();
		}
		return bancoService;
	}

	private ClienteService getClienteService() {
		if (clienteService == null) {
			clienteService = CustomSpringContext.getClienteService();
		}
		return clienteService;
	}

}
