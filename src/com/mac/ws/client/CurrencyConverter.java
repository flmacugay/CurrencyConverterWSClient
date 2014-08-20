package com.mac.ws.client;

import net.restfulwebservices.datacontracts._2008._01.Currency;
import net.restfulwebservices.datacontracts._2008._01.CurrencyCode;
import net.restfulwebservices.servicecontracts._2008._01.CurrencyService;
import net.restfulwebservices.servicecontracts._2008._01.ICurrencyService;
import net.restfulwebservices.servicecontracts._2008._01.ICurrencyServiceGetConversionRateDefaultFaultContractFaultFaultMessage;

/**
 * Simple WS client configuration
 * 
 * http://www.restfulwebservices.net/wcf/CurrencyService.svc?wsdl
 * 
 * 1. generate stubs/SEI (wsimport -keep -s src http://www.restfulwebservices.net/wcf/CurrencyService.svc?wsdl)
 * 2. create instance of the service (CurrencyService from <wsdl:service name="CurrencyService">)
 * 3. get port from service (CurrencyService.getBasicHttpBindingICurrencyService() from <wsdl:port name="BasicHttpBinding_ICurrencyService" binding="tns:BasicHttpBinding_ICurrencyService">)
 * 4. make remote method calls from port
 * 
 */
public class CurrencyConverter {

	public static void main(String[] args) throws ICurrencyServiceGetConversionRateDefaultFaultContractFaultFaultMessage {
		CurrencyService cs=new CurrencyService();
		ICurrencyService ics=cs.getBasicHttpBindingICurrencyService();
		Currency curr=ics.getConversionRate(CurrencyCode.AUD, CurrencyCode.PHP);
		System.out.println(curr.getRate());
	}

}
