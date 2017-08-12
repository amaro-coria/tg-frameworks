
package net.tecgurus.bancoservice._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clienteData" type="{http://www.tecgurus.net/bancoService/1.0}ClienteData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clienteData"
})
@XmlRootElement(name = "ClienteDataResponse")
public class ClienteDataResponse {

    @XmlElement(required = true)
    protected List<ClienteData> clienteData;

    /**
     * Gets the value of the clienteData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clienteData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClienteData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClienteData }
     * 
     * 
     */
    public List<ClienteData> getClienteData() {
        if (clienteData == null) {
            clienteData = new ArrayList<ClienteData>();
        }
        return this.clienteData;
    }

}
