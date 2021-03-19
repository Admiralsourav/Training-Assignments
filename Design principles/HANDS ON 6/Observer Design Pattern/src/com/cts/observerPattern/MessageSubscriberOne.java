package com.cts.observerPattern;

public class MessageSubscriberOne implements Observer {

	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

	public void observerState(State s) {
		if (s != null) {
			System.out.println("Subscriber one got the notfication that the state has been changed");
		}
	}

}
