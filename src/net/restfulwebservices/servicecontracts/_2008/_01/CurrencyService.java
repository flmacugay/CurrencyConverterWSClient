
package net.restfulwebservices.servicecontracts._2008._01;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyService", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", wsdlLocation = "http://www.restfulwebservices.net/wcf/CurrencyService.svc?wsdl")
public class CurrencyService
    extends Service
{

    private final static URL CURRENCYSERVICE_WSDL_LOCATION;
    private final static WebServiceException CURRENCYSERVICE_EXCEPTION;
    private final static QName CURRENCYSERVICE_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "CurrencyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.restfulwebservices.net/wcf/CurrencyService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYSERVICE_WSDL_LOCATION = url;
        CURRENCYSERVICE_EXCEPTION = e;
    }

    public CurrencyService() {
        super(__getWsdlLocation(), CURRENCYSERVICE_QNAME);
    }

    public CurrencyService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYSERVICE_QNAME, features);
    }

    public CurrencyService(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYSERVICE_QNAME);
    }

    public CurrencyService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYSERVICE_QNAME, features);
    }

    public CurrencyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICurrencyService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICurrencyService")
    public ICurrencyService getBasicHttpBindingICurrencyService() {
        return super.getPort(new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "BasicHttpBinding_ICurrencyService"), ICurrencyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICurrencyService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICurrencyService")
    public ICurrencyService getBasicHttpBindingICurrencyService(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "BasicHttpBinding_ICurrencyService"), ICurrencyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYSERVICE_EXCEPTION!= null) {
            throw CURRENCYSERVICE_EXCEPTION;
        }
        return CURRENCYSERVICE_WSDL_LOCATION;
    }

}
