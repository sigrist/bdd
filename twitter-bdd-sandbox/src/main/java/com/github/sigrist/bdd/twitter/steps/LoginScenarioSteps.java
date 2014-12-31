package com.github.sigrist.bdd.twitter.steps;

import com.github.sigrist.bdd.twitter.pages.TwitterErrorPage;
import com.github.sigrist.bdd.twitter.pages.TwitterHomePage;

import net.thucydides.core.steps.ScenarioSteps;

public class LoginScenarioSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7102709836099136851L;
	
	private TwitterHomePage twitterHomePage;
	
	private TwitterErrorPage twitterErrorPage;
	
	public void login() {
		twitterHomePage.submit();
	}

	public void isInTheHomePage() {
		twitterHomePage.open();
	}

	public void entersEmailAndPassword(String email, String password) {
		twitterHomePage.fillEmail(email);
		twitterHomePage.fillPassword(password);		
	}

	public boolean checkErrorMessage(String message) {
		return twitterErrorPage.checkMessage(message);
	}
}
