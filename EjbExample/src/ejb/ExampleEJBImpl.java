package ejb;
import javax.ejb.Stateless;

@Stateless
public class ExampleEJBImpl implements ExampleEJB {

	@Override
	public void deneme(String x) {
		// TODO Auto-generated method stub

	}

	@Override
	public String service() {
		return "service method";
	}

}
