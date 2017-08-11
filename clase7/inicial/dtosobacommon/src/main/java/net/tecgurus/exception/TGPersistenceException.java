package net.tecgurus.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Amaro on 10/08/2017.
 */
public class TGPersistenceException extends Exception{

    private static final Logger log = LoggerFactory.getLogger(TGPersistenceException.class);

    public TGPersistenceException() {
        super();
        log.error("Error en Persistencia sin mensaje");
    }

    public TGPersistenceException(String message, Throwable cause) {
        super(message, cause);
        log.error("Error en Persistencia::"+message, cause);
    }

    public TGPersistenceException(String message) {
        super(message);
        log.error("Error en Persistencia::"+message);
    }

    public TGPersistenceException(Throwable cause) {
        super(cause);
        log.error("Error en Persistencia solo con causa::"+cause.getMessage(), cause);
    }

}
