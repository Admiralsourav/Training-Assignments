package com.cts.chatMediator;

public class BasicUser implements Iuser {

	private ChatMediator chatMediator;
	private String userName;
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public BasicUser(ChatMediator chatMediator, String userName) {
		super();
		this.chatMediator = chatMediator;
		this.setUserName(userName);
	}

	@Override
	public void sendMessage(String message) {

		chatMediator.sendMessage(message + " : sent by : " + userName);
	}

	@Override
	public void receiveMessage(String message) {
		
		System.out.println( message + ": received by " + userName);
		
	}


}
