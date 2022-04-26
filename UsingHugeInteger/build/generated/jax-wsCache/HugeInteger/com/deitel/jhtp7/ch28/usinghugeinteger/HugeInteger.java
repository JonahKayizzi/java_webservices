
package com.deitel.jhtp7.ch28.usinghugeinteger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HugeInteger", targetNamespace = "http://ch28.jhtp7.deitel.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HugeInteger {


    /**
     * 
     * @param first
     * @param second
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.AddResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/addRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/addResponse")
    public String add(
        @WebParam(name = "first", targetNamespace = "")
        String first,
        @WebParam(name = "second", targetNamespace = "")
        String second);

    /**
     * 
     * @param first
     * @param second
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "equals", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Equals")
    @ResponseWrapper(localName = "equalsResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.EqualsResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/equalsRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/equalsResponse")
    public boolean equals(
        @WebParam(name = "first", targetNamespace = "")
        String first,
        @WebParam(name = "second", targetNamespace = "")
        String second);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "toString", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.ToString")
    @ResponseWrapper(localName = "toStringResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.ToStringResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/toStringRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/toStringResponse")
    public String toString();

    /**
     * 
     * @param first
     * @param second
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "smaller", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Smaller")
    @ResponseWrapper(localName = "smallerResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.SmallerResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/smallerRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/smallerResponse")
    public boolean smaller(
        @WebParam(name = "first", targetNamespace = "")
        String first,
        @WebParam(name = "second", targetNamespace = "")
        String second);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.HelloResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/helloRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param first
     * @param second
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bigger", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Bigger")
    @ResponseWrapper(localName = "biggerResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.BiggerResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/biggerRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/biggerResponse")
    public boolean bigger(
        @WebParam(name = "first", targetNamespace = "")
        String first,
        @WebParam(name = "second", targetNamespace = "")
        String second);

    /**
     * 
     * @param first
     * @param second
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.usinghugeinteger.SubtractResponse")
    @Action(input = "http://ch28.jhtp7.deitel.com/HugeInteger/subtractRequest", output = "http://ch28.jhtp7.deitel.com/HugeInteger/subtractResponse")
    public String subtract(
        @WebParam(name = "first", targetNamespace = "")
        String first,
        @WebParam(name = "second", targetNamespace = "")
        String second);

}
