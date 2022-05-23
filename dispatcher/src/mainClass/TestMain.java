package mainClass;

import eventHandlers.HandlerA;
import eventHandlers.HandlerB;
import eventHandlers.HandlerC;
import eventHandlers.HandlerD;
import events.AMain;
import events.BMain;
import events.CMain;
import events.DMain;

public class TestMain {

	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.registerHandler(new HandlerD());
		dispatcher.registerHandler(new HandlerC());
		dispatcher.registerHandler(new HandlerB());
		dispatcher.registerHandler(new HandlerA());
		var a = new HandlerB<BMain>();
		var eventA = new AMain();
		var eventB = new BMain();
		var eventC = new CMain();
		var eventD = new DMain();
		Event[] events={eventA,eventB,eventC,eventD};
		//System.out.println(dispatcher.eventHandlers);
		for(var e : events) {
			dispatcher.dispatch(e);
		}
	}

}
