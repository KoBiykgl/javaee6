package org.EgitimDemoDao;

import java.util.List;

import javax.ejb.Local;

import org.EgitimDemoDao.model.City;
import org.EgitimDemoDao.model.County;
import org.EgitimDemoDao.model.Gender;

@Local
public interface ParameterDao {

	public List<Gender> getGenderList();

	public List<City> getCityList();

	public List<County> getCountyList(Integer cityId);

}
