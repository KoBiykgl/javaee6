package org.EgitimDemoEjb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import org.EgitimDemoDao.ParameterDao;
import org.EgitimDemoDao.model.City;
import org.EgitimDemoDao.model.County;
import org.EgitimDemoDao.model.Gender;

@Singleton
public class ParameterBean {

	@EJB
	ParameterDao parameterDao;

	public List<Gender> getGenders() {
		return parameterDao.getGenderList();
	}

	public List<City> getCities() {
		return parameterDao.getCityList();
	}

	public List<County> getCounties(Integer cityId) {
		return parameterDao.getCountyList(cityId);
	}

}
