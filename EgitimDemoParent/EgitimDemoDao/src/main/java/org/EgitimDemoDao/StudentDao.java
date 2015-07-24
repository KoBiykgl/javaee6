package org.EgitimDemoDao;

import java.util.List;

import javax.ejb.Local;

import org.EgitimDemoDao.model.Student;

@Local
public interface StudentDao {

	public void addStudent(Student student);

	public List<Student> getStudents();

	public void removeStudent(Student student);

}
