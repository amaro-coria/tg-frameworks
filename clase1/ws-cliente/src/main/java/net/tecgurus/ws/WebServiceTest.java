
package net.tecgurus.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceTest", targetNamespace = "http://ws.tecgurus.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceTest {


    /**
     * 
     * @param arg0
     * @return
     *     returns net.tecgurus.ws.MiDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenEjemplo", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.ObtenEjemplo")
    @ResponseWrapper(localName = "obtenEjemploResponse", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.ObtenEjemploResponse")
    @Action(input = "http://ws.tecgurus.net/WebServiceTest/obtenEjemploRequest", output = "http://ws.tecgurus.net/WebServiceTest/obtenEjemploResponse")
    public MiDTO obtenEjemplo(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "altaEmpleado", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.AltaEmpleado")
    @ResponseWrapper(localName = "altaEmpleadoResponse", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.AltaEmpleadoResponse")
    @Action(input = "http://ws.tecgurus.net/WebServiceTest/altaEmpleadoRequest", output = "http://ws.tecgurus.net/WebServiceTest/altaEmpleadoResponse")
    public XMLGregorianCalendar altaEmpleado(
        @WebParam(name = "arg0", targetNamespace = "")
        MiDTO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saluda", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.Saluda")
    @ResponseWrapper(localName = "saludaResponse", targetNamespace = "http://ws.tecgurus.net/", className = "net.tecgurus.ws.SaludaResponse")
    @Action(input = "http://ws.tecgurus.net/WebServiceTest/saludaRequest", output = "http://ws.tecgurus.net/WebServiceTest/saludaResponse")
    public String saluda(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
