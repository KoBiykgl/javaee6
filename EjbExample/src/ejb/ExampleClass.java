package ejb;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

public class ExampleClass {

	@EJB
	ExampleEJB ejb;

	public void exampleMethod() {
		ejb.deneme("");
	}

	public void method() throws NamingException {
		EJBContainer ec = javax.ejb.embeddable.EJBContainer.createEJBContainer();
		Context ctx = ec.getContext();
		ExampleEJB foo = (ExampleEJB) ctx.lookup("java:global/EjbExample/ExampleEJBImpl");

	}

}
