package net.tecgurus.ws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import net.tecgurus.bancoservice._1.BancoData;
import net.tecgurus.bancoservice._1.BancoDataRequest;
import net.tecgurus.bancoservice._1.BancoDataResponse;
import net.tecgurus.bancoservice._1.BancoServicePortType;
import net.tecgurus.bancoservice._1.ClienteData;
import net.tecgurus.bancoservice._1.ClienteDataRequest;
import net.tecgurus.bancoservice._1.ClienteDataResponse;
import net.tecgurus.dto.BancoDTO;
import net.tecgurus.dto.ClienteDTO;
import net.tecgurus.exception.TGServiceException;
import net.tecgurus.service.ClienteService;

/**
 * Created by Amaro on 10/08/2017.
 */
@Endpoint
public class BancoServiceEndpoint implements BancoServicePortType {

	private final static String TARGET_NAMESPACE = "http://www.tecgurus.net/bancoService/1.0";
	private final static String SERVICE_NAME = "BancoService";

	@Autowired
	private net.tecgurus.service.BancoService bancoService;
	@Autowired
	private ClienteService clienteService;

	private static final Logger log = LoggerFactory.getLogger(BancoServiceEndpoint.class);

	@Override
	@PayloadRoot(localPart = "BancoDataRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload BancoDataResponse getDataOperation(@RequestPayload BancoDataRequest bancoDataRequest) {
		BancoDataResponse response = new BancoDataResponse();
		try {
			for (BancoDTO dto : bancoService.getAll()) {
				BancoData bancoData = new BancoData();
				bancoData.setId(dto.getIdBanco());
				bancoData.setNombre(dto.getNombre());
				response.getBancoData().add(bancoData);
			}
		} catch (TGServiceException e) {
			log.error("Error in WS: {}", e.getMessage());
		}
		return response;
	}

	@Override
	@PayloadRoot(localPart = "ClienteDataRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload ClienteDataResponse getClientesOperation(
			@RequestPayload ClienteDataRequest clienteDataRequest) {
		ClienteDataResponse response = new ClienteDataResponse();
		try {
			for (ClienteDTO dto : clienteService.getAll()) {
				ClienteData data = new ClienteData();
				data.setApellidoMater(dto.getAmaterno());
				data.setApellidoPaterno(dto.getApaterno());
				data.setEdad(dto.getEdad());
				data.setIdBanco(dto.getIdBanco());
				data.setNombre(dto.getNombre());
				response.getClienteData().add(data);
			}
		} catch (TGServiceException e) {
			log.error("Error finding cliente data: {}", e.getMessage());
		}
		return response;
	}
}
