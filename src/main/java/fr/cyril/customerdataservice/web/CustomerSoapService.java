package fr.cyril.customerdataservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2024-02-06T10:19:08.209+01:00
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "http://web.customerdataservice.cyril.fr/", name = "CustomerSoapService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerSoapService {

    @WebMethod
    @RequestWrapper(localName = "customerById", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.CustomerById")
    @ResponseWrapper(localName = "customerByIdResponse", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.CustomerByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.cyril.customerdataservice.web.Customer customerById(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0
    );

    @WebMethod
    @RequestWrapper(localName = "customerList", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.CustomerList")
    @ResponseWrapper(localName = "customerListResponse", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.CustomerListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.cyril.customerdataservice.web.Customer> customerList()
;

    @WebMethod
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.AddCustomer")
    @ResponseWrapper(localName = "addCustomerResponse", targetNamespace = "http://web.customerdataservice.cyril.fr/", className = "fr.cyril.customerdataservice.web.AddCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.cyril.customerdataservice.web.Customer addCustomer(

        @WebParam(name = "arg0", targetNamespace = "")
        fr.cyril.customerdataservice.web.CustomerDTO arg0
    );
}
