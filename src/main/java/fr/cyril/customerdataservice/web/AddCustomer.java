
package fr.cyril.customerdataservice.web;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addCustomer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://web.customerdataservice.cyril.fr/}customerDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCustomer", propOrder = {
    "arg0"
})
public class AddCustomer {

    protected CustomerDTO arg0;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDTO }
     *     
     */
    public CustomerDTO getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDTO }
     *     
     */
    public void setArg0(CustomerDTO value) {
        this.arg0 = value;
    }

}
