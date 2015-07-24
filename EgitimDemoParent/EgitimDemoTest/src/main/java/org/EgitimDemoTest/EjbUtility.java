package org.EgitimDemoTest;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.EgitimDemoEjbClient.EgitimDemoEjbRemote;

public class EjbUtility {

	private static InitialContext CTX;

	private static final String EGITIM_DEMO_EJB_REMOTE = "EgitimDemoEjbRemote";

	// private static final String EGITIM_DEMO_EJB_REMOTE =
	// "java:global/EgitimDemoWeb/EgitimDemoEjb!org.EgitimDemoEjb.EgitimDemoEjbRemote";

	public static EgitimDemoEjbRemote getEgitimDemoEjbRemote()
			throws NamingException {
		initContext();
		return (EgitimDemoEjbRemote) CTX.lookup(EGITIM_DEMO_EJB_REMOTE);
	}

	private static void initContext() throws NamingException {

		Properties p = new Properties();
		p.put("java.naming.factory.initial",
				"org.apache.openejb.client.RemoteInitialContextFactory");
		p.put("java.naming.provider.url", "http://127.0.0.1:8080/tomee/ejb");
		// user and pass optional
		// p.put("java.naming.security.principal", "myuser");
		// p.put("java.naming.security.credentials", "mypass");

		CTX = new InitialContext(p);
	}

}
