package com.cts.chatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IchatMediator{

	private List<Iuser> userList;
	
	
	public List<Iuser> getUserList() {
		return userList;
	}
	
	public void setUserList(List<Iuser> userList) {
		this.userList = userList;
	}
	
	public ChatMediator() {
		setUserList(new ArrayList<Iuser>());
	}

	@Override
	public void addUser(Iuser user) {
		getUserList().add(user);
	}

	public void sendMessage(String message) {

		for (Iuser iuser : userList) {
				iuser.receiveMessage(message);
		}
		
	}


}
