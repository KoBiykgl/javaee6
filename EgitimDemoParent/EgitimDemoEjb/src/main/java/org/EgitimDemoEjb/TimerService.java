package org.EgitimDemoEjb;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

import org.EgitimDemoEjbClient.EgitimDemoEjbLocal;

@Singleton
public class TimerService {

	@EJB
	EgitimDemoEjbLocal ejbLocal;

	//@Schedule(second = "*/30", minute = "*", hour = "*", persistent = false)
	public void doWork() {
		System.out.println("timer: " + ejbLocal.count(8));
		ejbLocal.print();
	}
}
