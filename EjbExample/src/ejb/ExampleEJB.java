package ejb;

import javax.ejb.Local;

@Local
public interface ExampleEJB {

	public void deneme(String x);

	public String service();

}
