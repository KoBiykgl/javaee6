package org.EgitimDemoEjb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.EgitimDemoEjbClient.EgitimDemoEjbLocal;
import org.EgitimDemoEjbClient.EgitimDemoEjbRemote;

@Stateless
public class EgitimDemoEjb implements EgitimDemoEjbLocal, EgitimDemoEjbRemote {

	@EJB
	ParameterBean parameterBean;

	@Override
	public void print() {
		System.out.println("Print metodu basladi");
		parameterBean.getCities();
		System.out.println("Print metodu bitti");
	}

	@Override
	public int count(int total) {
		System.out.println("Count metodu calisti");
		return total;
	}

}
