package eventHandlers;

import java.util.Comparator;

import mainClass.EventHandler;

public class ComparatorHandler implements Comparator<EventHandler>{

	@Override
	public int compare(EventHandler o1, EventHandler o2) {
		//System.out.println(o2.get().getClass()+ " "+ o1.get().getClass());
		if(o2.get().getClass().isAssignableFrom(o1.get().getClass())) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
