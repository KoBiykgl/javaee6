package org.EgitimDemoTest;

import static org.junit.Assert.assertEquals;

import org.EgitimDemoEjbClient.EgitimDemoEjbRemote;
import org.junit.Before;
import org.junit.Test;

public class EgitimDemoRemoteEjbTest {

	public static EgitimDemoEjbRemote remoteEjb;

	@Before
	public void setUp() throws Exception {
		remoteEjb = EjbUtility.getEgitimDemoEjbRemote();
	}

	@Test
	public void testPrint() {
		remoteEjb.print();
	}

	@Test
	public void testCount() {
		assertEquals(6, remoteEjb.count(8));
	}

}
