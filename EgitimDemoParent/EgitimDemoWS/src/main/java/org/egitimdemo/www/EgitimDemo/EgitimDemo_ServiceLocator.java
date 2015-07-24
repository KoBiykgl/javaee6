/**
 * EgitimDemo_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.egitimdemo.www.EgitimDemo;

public class EgitimDemo_ServiceLocator extends org.apache.axis.client.Service implements org.egitimdemo.www.EgitimDemo.EgitimDemo_Service {

    public EgitimDemo_ServiceLocator() {
    }


    public EgitimDemo_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EgitimDemo_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EgitimDemoSOAP
    private java.lang.String EgitimDemoSOAP_address = "http://www.example.org/";

    public java.lang.String getEgitimDemoSOAPAddress() {
        return EgitimDemoSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EgitimDemoSOAPWSDDServiceName = "EgitimDemoSOAP";

    public java.lang.String getEgitimDemoSOAPWSDDServiceName() {
        return EgitimDemoSOAPWSDDServiceName;
    }

    public void setEgitimDemoSOAPWSDDServiceName(java.lang.String name) {
        EgitimDemoSOAPWSDDServiceName = name;
    }

    public org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType getEgitimDemoSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EgitimDemoSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEgitimDemoSOAP(endpoint);
    }

    public org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType getEgitimDemoSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.egitimdemo.www.EgitimDemo.EgitimDemoSOAPStub _stub = new org.egitimdemo.www.EgitimDemo.EgitimDemoSOAPStub(portAddress, this);
            _stub.setPortName(getEgitimDemoSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEgitimDemoSOAPEndpointAddress(java.lang.String address) {
        EgitimDemoSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.egitimdemo.www.EgitimDemo.EgitimDemoSOAPStub _stub = new org.egitimdemo.www.EgitimDemo.EgitimDemoSOAPStub(new java.net.URL(EgitimDemoSOAP_address), this);
                _stub.setPortName(getEgitimDemoSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EgitimDemoSOAP".equals(inputPortName)) {
            return getEgitimDemoSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "EgitimDemo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "EgitimDemoSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EgitimDemoSOAP".equals(portName)) {
            setEgitimDemoSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
