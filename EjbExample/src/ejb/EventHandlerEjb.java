package ejb;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class EventHandlerEjb {

	@Asynchronous
	public void eventHandler(@Observes MessageEvent e) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(e.getMessage() + " is handled");
	}

}
