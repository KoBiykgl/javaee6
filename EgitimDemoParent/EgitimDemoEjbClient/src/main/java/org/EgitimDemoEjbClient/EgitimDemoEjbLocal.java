package org.EgitimDemoEjbClient;

import javax.ejb.Local;

@Local
public interface EgitimDemoEjbLocal {

	public void print();

	public int count(int total);

}
