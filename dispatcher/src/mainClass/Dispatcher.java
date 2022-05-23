package mainClass;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import eventHandlers.ComparatorHandler;

public class Dispatcher {
	
	ComparatorHandler comp = new ComparatorHandler();
	TreeSet<EventHandler> eventHandlers = new TreeSet<EventHandler>(comp);
	//List<EventHandler> eventHandlers = new ArrayList<EventHandler>();
	public void dispatch(Event event) {
		for(var e : eventHandlers) {
			if(e.checkEvent(event)) {
				e.process(event);
				break;
			}
		}
	}
	public void registerHandler(EventHandler handler) {
		eventHandlers.add(handler);
		//eventHandlers.sort(comp);
	}
}
