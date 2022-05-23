package mainClass;

import events.AMain;
import events.BMain;

public interface EventHandler{
	public Boolean checkEvent(Event event);
	public void process(Event event);
	public Object get();
}
