package eventHandlers;

import events.AMain;
import events.BMain;
import mainClass.Event;
import mainClass.EventHandler;

public class HandlerA<T extends AMain> implements EventHandler{
	private AMain a = new AMain();
	public HandlerA() {
		
	}
	public void process(Event event) {
		event.process();
	}
	@Override
	public Boolean checkEvent(Event event) {
		if(event instanceof AMain) {
			System.out.println(this.getClass().toString().substring(20) + " берёт событие на обработку");
			//this.process(event);
			return true;
		}
		System.out.println(this.getClass().toString().substring(20) + " не может обработать");
		return false;
		
	}
	@Override
	public Object get() {
		return a;
	}
}
