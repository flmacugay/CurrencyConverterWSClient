
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.datacontracts._2008._01 package. 
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

    private final static QName _CurrencyCode_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "CurrencyCode");
    private final static QName _Currency_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Currency");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.datacontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "CurrencyCode")
    public JAXBElement<CurrencyCode> createCurrencyCode(CurrencyCode value) {
        return new JAXBElement<CurrencyCode>(_CurrencyCode_QNAME, CurrencyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

}
