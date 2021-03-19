package com.cts.observerPattern;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());		
	}
	
	public void observerState(State s) {
		if (s != null) {
			System.out.println("Subscriber Three got the notfication that the state has been changed");
		}
	}

}
