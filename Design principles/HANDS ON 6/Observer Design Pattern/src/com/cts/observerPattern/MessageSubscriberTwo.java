package com.cts.observerPattern;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());		
	}
	
	public void observerState(State s) {
		if (s != null) {
			System.out.println("Subscriber Two got the notfication that the state has been changed");
		}
	}

}
