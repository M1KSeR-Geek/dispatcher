package eventHandlers;

import events.AMain;
import events.BMain;
import events.DMain;
import mainClass.Event;
import mainClass.EventHandler;

public class HandlerD<T extends DMain> implements EventHandler{
	private DMain d = new DMain();
	public HandlerD() {
		
	}
	public void process(Event event) {
		event.process();
	}
	@Override
	public Boolean checkEvent(Event event) {
		if(event instanceof DMain) {
			System.out.println(this.getClass().toString().substring(20) + " берёт событие на обработку");
			//this.process(event);
			return true;
		}
		System.out.println(this.getClass().toString().substring(20) + " не может обработать");
		return false;
	}
	@Override
	public Object get() {
		
		return d;
	}
}