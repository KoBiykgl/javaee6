package org.EgitimDemoDao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.EgitimDemoDao.model.Student;

@Stateless
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext(unitName = "EgitimDemoPU")
	private EntityManager em;

	@Override
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Override
	public List<Student> getStudents() {
		return em.createNamedQuery("Student.getAll").getResultList();
	}

	@Override
	public void removeStudent(Student student) {
		Student toBeRemoved = em.merge(student);
		em.remove(toBeRemoved);
	}

}
