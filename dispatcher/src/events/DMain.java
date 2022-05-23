package events;

import mainClass.Event;

public class DMain extends CMain implements Event{
	public void process() {
		System.out.println("обработан");
	}
}
