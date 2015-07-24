/**
 * EgitimDemoSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.egitimdemo.www.EgitimDemo;

public class EgitimDemoSOAPSkeleton implements org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType, org.apache.axis.wsdl.Skeleton {
    private org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getCityList", _params, new javax.xml.namespace.QName("", "cityList"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "CityType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "GetCityList"));
        _oper.setSoapAction("http://www.egitimdemo.org/EgitimDemo/GetCityList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCityList") == null) {
            _myOperations.put("getCityList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCityList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "city"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "CityType"), org.egitimdemo.www.EgitimDemo.CityType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCountyList", _params, new javax.xml.namespace.QName("", "countyList"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "CountyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.egitimdemo.org/EgitimDemo/", "GetCountyList"));
        _oper.setSoapAction("http://www.egitimdemo.org/EgitimDemo/GetCountyList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCountyList") == null) {
            _myOperations.put("getCountyList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCountyList")).add(_oper);
    }

    public EgitimDemoSOAPSkeleton() {
        this.impl = new org.egitimdemo.www.EgitimDemo.EgitimDemoSOAPImpl();
    }

    public EgitimDemoSOAPSkeleton(org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType impl) {
        this.impl = impl;
    }
    public org.egitimdemo.www.EgitimDemo.CityType[] getCityList() throws java.rmi.RemoteException
    {
        org.egitimdemo.www.EgitimDemo.CityType[] ret = impl.getCityList();
        return ret;
    }

    public org.egitimdemo.www.EgitimDemo.CountyType[] getCountyList(org.egitimdemo.www.EgitimDemo.CityType city) throws java.rmi.RemoteException
    {
        org.egitimdemo.www.EgitimDemo.CountyType[] ret = impl.getCountyList(city);
        return ret;
    }

}
