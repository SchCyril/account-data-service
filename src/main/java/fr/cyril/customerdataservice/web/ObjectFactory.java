
package fr.cyril.customerdataservice.web;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.cyril.customerdataservice.web package. 
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

    private final static QName _AddCustomer_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "addCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "addCustomerResponse");
    private final static QName _CustomerById_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "customerById");
    private final static QName _CustomerByIdResponse_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "customerByIdResponse");
    private final static QName _CustomerList_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "customerList");
    private final static QName _CustomerListResponse_QNAME = new QName("http://web.customerdataservice.cyril.fr/", "customerListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.cyril.customerdataservice.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link CustomerById }
     * 
     */
    public CustomerById createCustomerById() {
        return new CustomerById();
    }

    /**
     * Create an instance of {@link CustomerByIdResponse }
     * 
     */
    public CustomerByIdResponse createCustomerByIdResponse() {
        return new CustomerByIdResponse();
    }

    /**
     * Create an instance of {@link CustomerList }
     * 
     */
    public CustomerList createCustomerList() {
        return new CustomerList();
    }

    /**
     * Create an instance of {@link CustomerListResponse }
     * 
     */
    public CustomerListResponse createCustomerListResponse() {
        return new CustomerListResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CustomerDTO }
     * 
     */
    public CustomerDTO createCustomerDTO() {
        return new CustomerDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerById }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "customerById")
    public JAXBElement<CustomerById> createCustomerById(CustomerById value) {
        return new JAXBElement<CustomerById>(_CustomerById_QNAME, CustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "customerByIdResponse")
    public JAXBElement<CustomerByIdResponse> createCustomerByIdResponse(CustomerByIdResponse value) {
        return new JAXBElement<CustomerByIdResponse>(_CustomerByIdResponse_QNAME, CustomerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerList }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "customerList")
    public JAXBElement<CustomerList> createCustomerList(CustomerList value) {
        return new JAXBElement<CustomerList>(_CustomerList_QNAME, CustomerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.customerdataservice.cyril.fr/", name = "customerListResponse")
    public JAXBElement<CustomerListResponse> createCustomerListResponse(CustomerListResponse value) {
        return new JAXBElement<CustomerListResponse>(_CustomerListResponse_QNAME, CustomerListResponse.class, null, value);
    }

}
