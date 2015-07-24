/**
 * EgitimDemoSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.egitimdemo.www.EgitimDemo;

public class EgitimDemoSOAPImpl implements org.egitimdemo.www.EgitimDemo.EgitimDemo_PortType{
    public org.egitimdemo.www.EgitimDemo.CityType[] getCityList() throws java.rmi.RemoteException {
    	
    	CityType city = new CityType();
    	city.setId("34");
    	city.setCode("34");
    	city.setName("Istanbul");
    	
    	CountyType [] countyList = new CountyType[1];
    	
    	CountyType county = new CountyType();
    	county.setId("1");
    	county.setName("Kadikoy");
    	
    	countyList[0] = county;
    	
    	city.setCountyList(countyList);
    	
    	CityType [] cityList = new CityType[1];
    	
    	cityList[0] = city;
    	
    	
        return cityList;
    }

    public org.egitimdemo.www.EgitimDemo.CountyType[] getCountyList(org.egitimdemo.www.EgitimDemo.CityType city) throws java.rmi.RemoteException {
        return null;
    }

}
