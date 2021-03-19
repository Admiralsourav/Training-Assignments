package com.cts.chatMediator;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		
		BasicUser basicUser = new BasicUser(chatMediator, "Sourav");
		PremiumUser premiumUser = new PremiumUser(chatMediator, "Gourav");
		
		chatMediator.addUser(basicUser);
		chatMediator.addUser(premiumUser);
		
		basicUser.sendMessage("Hi my name is sourav");
		
		
		
	}
}
