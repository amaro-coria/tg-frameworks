package net.tecgurus.ws.endpoint;


import net.tecgurus.bancoservice._1.*;
import net.tecgurus.dto.BancoDTO;
import net.tecgurus.exception.TGServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Amaro on 10/08/2017.
 */
@Endpoint
public class BancoServiceEndpoint implements BancoServicePortType {

    private final static String TARGET_NAMESPACE = "http://www.tecgurus.net/bancoService/1.0";
    private final static String SERVICE_NAME = "BancoService";

    @Autowired
    private net.tecgurus.service.BancoService bancoService;

    private static final Logger log = LoggerFactory.getLogger(BancoServiceEndpoint.class);

    @Override
    @PayloadRoot(localPart = "BancoDataRequest", namespace = TARGET_NAMESPACE)
    public @ResponsePayload
    BancoDataResponse getDataOperation(@RequestPayload BancoDataRequest bancoDataRequest) {
        BancoDataResponse response = new BancoDataResponse();
        try {
            for(BancoDTO dto : bancoService.getAll()){
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
}
