
package net.restfulwebservices.servicecontracts._2008._01;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.restfulwebservices.datacontracts._2008._01.Currency;
import net.restfulwebservices.datacontracts._2008._01.CurrencyCode;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICurrencyService", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    faultcontracts.gotlservices._2008._01.ObjectFactory.class,
    net.restfulwebservices.datacontracts._2008._01.ObjectFactory.class,
    net.restfulwebservices.servicecontracts._2008._01.ObjectFactory.class
})
public interface ICurrencyService {


    /**
     * 
     * @param fromCurrency
     * @param toCurrency
     * @return
     *     returns net.restfulwebservices.datacontracts._2008._01.Currency
     * @throws ICurrencyServiceGetConversionRateDefaultFaultContractFaultFaultMessage
     */
    @WebMethod(operationName = "GetConversionRate", action = "GetConversionRate")
    @WebResult(name = "GetConversionRateResult", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01")
    @RequestWrapper(localName = "GetConversionRate", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", className = "net.restfulwebservices.servicecontracts._2008._01.GetConversionRate")
    @ResponseWrapper(localName = "GetConversionRateResponse", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", className = "net.restfulwebservices.servicecontracts._2008._01.GetConversionRateResponse")
    public Currency getConversionRate(
        @WebParam(name = "FromCurrency", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01")
        CurrencyCode fromCurrency,
        @WebParam(name = "ToCurrency", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01")
        CurrencyCode toCurrency)
        throws ICurrencyServiceGetConversionRateDefaultFaultContractFaultFaultMessage
    ;

}
