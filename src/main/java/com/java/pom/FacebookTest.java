package com.java.pom;

public class FacebookTest {
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.doLogin();
		
		HomePage homePage = new HomePage();
		homePage.sendFriendRequest();
		homePage.sendMessage();
		
//		method chaining 
		new LoginPage().doLogin().sendFriendRequest().sendMessage();
		
	}

}
