package events;

import mainClass.Event;

public class CMain extends AMain implements Event{
	public void process() {
		System.out.println("обработан");
	}
}