package net.tecgurus.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Amaro on 10/08/2017.
 */
public class TGServiceException extends Exception {

    private static Logger log = LoggerFactory.getLogger(TGServiceException.class);

    public TGServiceException() {
        log.error("Error en Servicio sin descripcion");
    }

    public TGServiceException(String message) {
        super(message);
        log.error("Error en Servicio::"+message);
    }

    public TGServiceException(Throwable cause) {
        super(cause);
        log.error("Error en servicio solo con causa::"+cause.getMessage(), cause);
    }

    public TGServiceException(String message, Throwable cause) {
        super(message, cause);
        log.error("Error en Servicio::"+message, cause);
    }

}