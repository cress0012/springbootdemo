
package com.tiilii.fs.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * My portType description
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IFSService", targetNamespace = "http://ws.fs.tiilii.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IFSService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tiifsSelect", targetNamespace = "http://ws.fs.tiilii.com/", className = "com.tiilii.fs.ws.TiifsSelect")
    @ResponseWrapper(localName = "tiifsSelectResponse", targetNamespace = "http://ws.fs.tiilii.com/", className = "com.tiilii.fs.ws.TiifsSelectResponse")
    public String tiifsSelect(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tiifsUpload", targetNamespace = "http://ws.fs.tiilii.com/", className = "com.tiilii.fs.ws.TiifsUpload")
    @ResponseWrapper(localName = "tiifsUploadResponse", targetNamespace = "http://ws.fs.tiilii.com/", className = "com.tiilii.fs.ws.TiifsUploadResponse")
    public String tiifsUpload(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        byte[] arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

}