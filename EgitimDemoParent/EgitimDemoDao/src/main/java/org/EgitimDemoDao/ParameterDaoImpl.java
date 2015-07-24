package org.EgitimDemoDao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.EgitimDemoDao.model.City;
import org.EgitimDemoDao.model.County;
import org.EgitimDemoDao.model.Gender;

@Stateless
public class ParameterDaoImpl implements ParameterDao {

	@PersistenceContext(unitName = "EgitimDemoPU")
	private EntityManager em;

	@Override
	public List<Gender> getGenderList() {
		return em.createNamedQuery("Gender.getAll").getResultList();
	}

	@Override
	public List<City> getCityList() {
		return em.createNamedQuery("City.getAll").getResultList();
	}

	@Override
	public List<County> getCountyList(Integer cityId) {
		return em.createQuery("select c from County c where c.city.id=:cityId")
				.setParameter("cityId", cityId).getResultList();
	}

}
