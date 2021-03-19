package com.cts.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observer = new ArrayList<Observer>();
	@Override
	public void attach(Observer o) {
		observer.add(o);
	}

	@Override
	public void detach(Observer o) {
		observer.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observer) {
			o.update(m);;
		}
	}
	
	//the code metioned
	public State state=null;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}	

}
