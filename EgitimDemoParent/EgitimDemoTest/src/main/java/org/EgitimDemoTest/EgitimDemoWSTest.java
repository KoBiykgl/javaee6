package org.EgitimDemoTest;

import org.egitimdemoejb.ws.EgitimDemoWS;
import org.egitimdemoejb.ws.EgitimDemoWSService;
import org.junit.Before;
import org.junit.Test;

public class EgitimDemoWSTest {

	public static EgitimDemoWS ws;

	@Before
	public void setUp() throws Exception {
		ws = new EgitimDemoWSService().getEgitimDemoWSPort();
	}

	@Test
	public void getGenders() {
		System.out.println(ws.getGenders().size());
	}

	@Test
	public void getCities() {
		System.out.println(ws.getCities().size());
	}

	@Test
	public void getCounties() {
		System.out.println(ws.getCounties(34).size());
	}

	@Test
	public void addStudent() {
		// ws.addStudent(student);
	}

	@Test
	public void getStudents() {
		System.out.println(ws.getStudents().size());
	}

	@Test
	public void removeStudent() {
		// ws.removeStudent(student);
	}

}
