package eventHandlers;

import events.AMain;
import events.BMain;
import events.CMain;
import mainClass.Event;
import mainClass.EventHandler;

public class HandlerC<T extends CMain> implements EventHandler{
	private CMain c = new CMain();
	public HandlerC() {
		
	}
	public void process(Event event) {
		event.process();
	}
	@Override
	public Boolean checkEvent(Event event) {
		if(event instanceof CMain) {
			System.out.println(this.getClass().toString().substring(20) + " берёт событие на обработку");
			//this.process(event);
			return true;
		}
		System.out.println(this.getClass().toString().substring(20) + " не может обработать");
		return false;
	}
	@Override
	public Object get() {
		
		return c;
	}
}
