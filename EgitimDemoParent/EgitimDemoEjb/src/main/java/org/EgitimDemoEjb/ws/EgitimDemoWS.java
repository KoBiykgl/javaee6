package org.EgitimDemoEjb.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.EgitimDemoDao.model.City;
import org.EgitimDemoDao.model.County;
import org.EgitimDemoDao.model.Gender;
import org.EgitimDemoDao.model.Student;
import org.EgitimDemoEjb.ParameterBean;
import org.EgitimDemoEjb.StudentBean;

@WebService
@Stateless
public class EgitimDemoWS {

	@EJB
	ParameterBean parameterBean;

	@EJB
	StudentBean studentBean;

	@WebMethod
	public List<Gender> getGenders() {
		return parameterBean.getGenders();
	}

	@WebMethod
	public List<City> getCities() {
		return parameterBean.getCities();
	}

	@WebMethod
	public List<County> getCounties(Integer cityId) {
		return parameterBean.getCounties(cityId);
	}

	@WebMethod
	public void addStudent(Student student) {
		studentBean.addStudent(student);
	}

	@WebMethod
	public List<Student> getStudents() {
		return studentBean.getStudents();
	}

	@WebMethod
	public void removeStudent(Student student) {
		studentBean.removeStudent(student);
	}

}
