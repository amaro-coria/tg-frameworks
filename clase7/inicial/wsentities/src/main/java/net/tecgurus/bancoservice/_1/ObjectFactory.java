
package net.tecgurus.bancoservice._1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.tecgurus.bancoservice._1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.tecgurus.bancoservice._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BancoDataRequest }
     * 
     */
    public BancoDataRequest createBancoDataRequest() {
        return new BancoDataRequest();
    }

    /**
     * Create an instance of {@link AuditFields }
     * 
     */
    public AuditFields createAuditFields() {
        return new AuditFields();
    }

    /**
     * Create an instance of {@link ClienteDataRequest }
     * 
     */
    public ClienteDataRequest createClienteDataRequest() {
        return new ClienteDataRequest();
    }

    /**
     * Create an instance of {@link ClienteDataResponse }
     * 
     */
    public ClienteDataResponse createClienteDataResponse() {
        return new ClienteDataResponse();
    }

    /**
     * Create an instance of {@link ClienteData }
     * 
     */
    public ClienteData createClienteData() {
        return new ClienteData();
    }

    /**
     * Create an instance of {@link BancoDataResponse }
     * 
     */
    public BancoDataResponse createBancoDataResponse() {
        return new BancoDataResponse();
    }

    /**
     * Create an instance of {@link BancoData }
     * 
     */
    public BancoData createBancoData() {
        return new BancoData();
    }

}
