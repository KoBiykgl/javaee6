/**
 * EgitimDemo_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.egitimdemo.www.EgitimDemo;

public interface EgitimDemo_PortType extends java.rmi.Remote {
    public org.egitimdemo.www.EgitimDemo.CityType[] getCityList() throws java.rmi.RemoteException;
    public org.egitimdemo.www.EgitimDemo.CountyType[] getCountyList(org.egitimdemo.www.EgitimDemo.CityType city) throws java.rmi.RemoteException;
}
