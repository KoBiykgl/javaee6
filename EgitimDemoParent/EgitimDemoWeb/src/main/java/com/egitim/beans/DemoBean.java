package com.egitim.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import org.EgitimDemoDao.model.City;
import org.EgitimDemoDao.model.County;
import org.EgitimDemoDao.model.Gender;
import org.EgitimDemoEjb.ParameterBean;

@Named("demoBean")
@SessionScoped
public class DemoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7845617698865063163L;
	private String name;
	private String surname;
	private String age;
	private String gender;
	private List<SelectItem> genders;
	private String address;
	private String city;
	private List<SelectItem> cities;
	private String county;
	private List<SelectItem> counties;
	private Boolean showCounty = false;

	@EJB
	ParameterBean parameterBean;

	@PostConstruct
	public void doldur() {

		List<Gender> genderList = parameterBean.getGenders();

		genders = new ArrayList<SelectItem>();

		for (Gender gender : genderList) {
			genders.add(new SelectItem(gender.getId(), gender.getName()));
		}

		List<City> cityList = parameterBean.getCities();

		cities = new ArrayList<SelectItem>();

		cities.add(new SelectItem(-1, "Seciniz"));

		for (City city : cityList) {
			cities.add(new SelectItem(city.getId(), city.getName()));
		}

		counties = new ArrayList<SelectItem>();
	}

	public void valueChangeMethod(ValueChangeEvent event) {
		showCounty = true;
		counties.clear();
		System.out.println("old value:" + event.getOldValue() + " new value:"
				+ event.getNewValue());

		List<County> countyList = parameterBean.getCounties(Integer
				.valueOf((String) event.getNewValue()));

		for (County county : countyList) {
			counties.add(new SelectItem(county.getId(), county.getName()));
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<SelectItem> getGenders() {
		return genders;
	}

	public void setGenders(List<SelectItem> genders) {
		this.genders = genders;
	}

	public String kaydet() {
		System.out.println(this.toString());
		return null;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<SelectItem> getCities() {
		return cities;
	}

	public void setCities(List<SelectItem> cities) {
		this.cities = cities;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public List<SelectItem> getCounties() {
		return counties;
	}

	public void setCounties(List<SelectItem> counties) {
		this.counties = counties;
	}

	public Boolean getShowCounty() {
		return showCounty;
	}

	public void setShowCounty(Boolean showCounty) {
		this.showCounty = showCounty;
	}

	@Override
	public String toString() {
		return "DemoBean [name=" + name + ", surname=" + surname + ", age="
				+ age + ", gender=" + gender + ", genders=" + genders
				+ ", address=" + address + ", city=" + city + ", county="
				+ county + "]";
	}

}
