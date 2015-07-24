package org.EgitimDemoEjb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.EgitimDemoDao.StudentDao;
import org.EgitimDemoDao.model.Student;

@Stateless
public class StudentBean {

	@EJB
	StudentDao studentDao;

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	public void removeStudent(Student student) {
		studentDao.removeStudent(student);
	}

}
