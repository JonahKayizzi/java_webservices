
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
@WebServiceClient(name = "HugeInteger", targetNamespace = "http://ch28.jhtp7.deitel.com/", wsdlLocation = "http://localhost:8080/HugeInteger/HugeInteger?wsdl")
public class HugeInteger_Service
    extends Service
{

    private final static URL HUGEINTEGER_WSDL_LOCATION;
    private final static WebServiceException HUGEINTEGER_EXCEPTION;
    private final static QName HUGEINTEGER_QNAME = new QName("http://ch28.jhtp7.deitel.com/", "HugeInteger");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HugeInteger/HugeInteger?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HUGEINTEGER_WSDL_LOCATION = url;
        HUGEINTEGER_EXCEPTION = e;
    }

    public HugeInteger_Service() {
        super(__getWsdlLocation(), HUGEINTEGER_QNAME);
    }

    public HugeInteger_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HUGEINTEGER_QNAME, features);
    }

    public HugeInteger_Service(URL wsdlLocation) {
        super(wsdlLocation, HUGEINTEGER_QNAME);
    }

    public HugeInteger_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HUGEINTEGER_QNAME, features);
    }

    public HugeInteger_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HugeInteger_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
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
        if (HUGEINTEGER_EXCEPTION!= null) {
            throw HUGEINTEGER_EXCEPTION;
        }
        return HUGEINTEGER_WSDL_LOCATION;
    }

}