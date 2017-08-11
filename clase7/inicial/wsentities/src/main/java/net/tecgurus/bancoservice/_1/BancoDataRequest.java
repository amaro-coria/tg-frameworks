
package net.tecgurus.bancoservice._1;

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
 *         &lt;element name="iden" type="{http://www.tecgurus.net/bancoService/1.0}AuditFields"/>
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
    "iden"
})
@XmlRootElement(name = "BancoDataRequest")
public class BancoDataRequest {

    @XmlElement(required = true)
    protected AuditFields iden;

    /**
     * Obtiene el valor de la propiedad iden.
     * 
     * @return
     *     possible object is
     *     {@link AuditFields }
     *     
     */
    public AuditFields getIden() {
        return iden;
    }

    /**
     * Define el valor de la propiedad iden.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditFields }
     *     
     */
    public void setIden(AuditFields value) {
        this.iden = value;
    }

}
