package ejb;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class TimerService {

	@EJB
	EventFireEjb ejb;

	@Schedule(second = "*/15", minute = "*", hour = "*", persistent = false)
	public void callFireEvent() {
		System.out.println("callFireEvent");
		ejb.createEvent("");
	}

}
