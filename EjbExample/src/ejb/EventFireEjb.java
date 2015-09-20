package ejb;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@Stateless
public class EventFireEjb {

	@Inject
	Event<MessageEvent> events;

	public void createEvent(@NotNull String arg) {
		System.out.println("createEvent");
		MessageEvent e = new MessageEvent("event fired");
		events.fire(e);
		System.out.println("createevent finished");
	}

}
