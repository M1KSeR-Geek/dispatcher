package events;

import mainClass.Event;

public class BMain implements Event{
	public void process() {
		System.out.println("обработан");
	}
}