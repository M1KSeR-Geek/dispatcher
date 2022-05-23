package events;

import mainClass.Event;

public class AMain implements Event{
	public void process() {
		System.out.println("обработан");
	}
}
