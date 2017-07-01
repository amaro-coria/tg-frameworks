
package net.tecgurus.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.tecgurus.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AltaEmpleado_QNAME = new QName("http://ws.tecgurus.net/", "altaEmpleado");
    private final static QName _SaludaResponse_QNAME = new QName("http://ws.tecgurus.net/", "saludaResponse");
    private final static QName _ObtenEjemploResponse_QNAME = new QName("http://ws.tecgurus.net/", "obtenEjemploResponse");
    private final static QName _ObtenEjemplo_QNAME = new QName("http://ws.tecgurus.net/", "obtenEjemplo");
    private final static QName _Saluda_QNAME = new QName("http://ws.tecgurus.net/", "saluda");
    private final static QName _AltaEmpleadoResponse_QNAME = new QName("http://ws.tecgurus.net/", "altaEmpleadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.tecgurus.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenEjemplo }
     * 
     */
    public ObtenEjemplo createObtenEjemplo() {
        return new ObtenEjemplo();
    }

    /**
     * Create an instance of {@link Saluda }
     * 
     */
    public Saluda createSaluda() {
        return new Saluda();
    }

    /**
     * Create an instance of {@link AltaEmpleadoResponse }
     * 
     */
    public AltaEmpleadoResponse createAltaEmpleadoResponse() {
        return new AltaEmpleadoResponse();
    }

    /**
     * Create an instance of {@link ObtenEjemploResponse }
     * 
     */
    public ObtenEjemploResponse createObtenEjemploResponse() {
        return new ObtenEjemploResponse();
    }

    /**
     * Create an instance of {@link AltaEmpleado }
     * 
     */
    public AltaEmpleado createAltaEmpleado() {
        return new AltaEmpleado();
    }

    /**
     * Create an instance of {@link SaludaResponse }
     * 
     */
    public SaludaResponse createSaludaResponse() {
        return new SaludaResponse();
    }

    /**
     * Create an instance of {@link MiDTO }
     * 
     */
    public MiDTO createMiDTO() {
        return new MiDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "altaEmpleado")
    public JAXBElement<AltaEmpleado> createAltaEmpleado(AltaEmpleado value) {
        return new JAXBElement<AltaEmpleado>(_AltaEmpleado_QNAME, AltaEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "saludaResponse")
    public JAXBElement<SaludaResponse> createSaludaResponse(SaludaResponse value) {
        return new JAXBElement<SaludaResponse>(_SaludaResponse_QNAME, SaludaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenEjemploResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "obtenEjemploResponse")
    public JAXBElement<ObtenEjemploResponse> createObtenEjemploResponse(ObtenEjemploResponse value) {
        return new JAXBElement<ObtenEjemploResponse>(_ObtenEjemploResponse_QNAME, ObtenEjemploResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenEjemplo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "obtenEjemplo")
    public JAXBElement<ObtenEjemplo> createObtenEjemplo(ObtenEjemplo value) {
        return new JAXBElement<ObtenEjemplo>(_ObtenEjemplo_QNAME, ObtenEjemplo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saluda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "saluda")
    public JAXBElement<Saluda> createSaluda(Saluda value) {
        return new JAXBElement<Saluda>(_Saluda_QNAME, Saluda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tecgurus.net/", name = "altaEmpleadoResponse")
    public JAXBElement<AltaEmpleadoResponse> createAltaEmpleadoResponse(AltaEmpleadoResponse value) {
        return new JAXBElement<AltaEmpleadoResponse>(_AltaEmpleadoResponse_QNAME, AltaEmpleadoResponse.class, null, value);
    }

}
