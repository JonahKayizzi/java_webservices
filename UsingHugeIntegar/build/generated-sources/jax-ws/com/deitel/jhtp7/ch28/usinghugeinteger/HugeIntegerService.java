
package com.deitel.jhtp7.ch28.usinghugeinteger;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HugeIntegerService", targetNamespace = "http://ch28.jhtp7.deitel.com/", wsdlLocation = "http://localhost:8080/HugeInteger/HugeIntegerService?wsdl")
public class HugeIntegerService
    extends Service
{

    private final static URL HUGEINTEGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException HUGEINTEGERSERVICE_EXCEPTION;
    private final static QName HUGEINTEGERSERVICE_QNAME = new QName("http://ch28.jhtp7.deitel.com/", "HugeIntegerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HugeInteger/HugeIntegerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HUGEINTEGERSERVICE_WSDL_LOCATION = url;
        HUGEINTEGERSERVICE_EXCEPTION = e;
    }

    public HugeIntegerService() {
        super(__getWsdlLocation(), HUGEINTEGERSERVICE_QNAME);
    }

    public HugeIntegerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HUGEINTEGERSERVICE_QNAME, features);
    }

    public HugeIntegerService(URL wsdlLocation) {
        super(wsdlLocation, HUGEINTEGERSERVICE_QNAME);
    }

    public HugeIntegerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HUGEINTEGERSERVICE_QNAME, features);
    }

    public HugeIntegerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HugeIntegerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HugeInteger
     */
    @WebEndpoint(name = "HugeIntegerPort")
    public HugeInteger getHugeIntegerPort() {
        return super.getPort(new QName("http://ch28.jhtp7.deitel.com/", "HugeIntegerPort"), HugeInteger.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HugeInteger
     */
    @WebEndpoint(name = "HugeIntegerPort")
    public HugeInteger getHugeIntegerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ch28.jhtp7.deitel.com/", "HugeIntegerPort"), HugeInteger.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HUGEINTEGERSERVICE_EXCEPTION!= null) {
            throw HUGEINTEGERSERVICE_EXCEPTION;
        }
        return HUGEINTEGERSERVICE_WSDL_LOCATION;
    }

}
