
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.restfulwebservices.datacontracts._2008._01.Currency;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.servicecontracts._2008._01 package. 
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

    private final static QName _GetConversionRateResponseGetConversionRateResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetConversionRateResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.servicecontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConversionRateResponse }
     * 
     */
    public GetConversionRateResponse createGetConversionRateResponse() {
        return new GetConversionRateResponse();
    }

    /**
     * Create an instance of {@link GetConversionRate }
     * 
     */
    public GetConversionRate createGetConversionRate() {
        return new GetConversionRate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetConversionRateResult", scope = GetConversionRateResponse.class)
    public JAXBElement<Currency> createGetConversionRateResponseGetConversionRateResult(Currency value) {
        return new JAXBElement<Currency>(_GetConversionRateResponseGetConversionRateResult_QNAME, Currency.class, GetConversionRateResponse.class, value);
    }

}
