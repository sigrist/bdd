package com.github.sigrist.bdd.twitter.steps;

import com.github.sigrist.bdd.twitter.pages.TwitterErrorPage;
import com.github.sigrist.bdd.twitter.pages.TwitterHomePage;
import com.github.sigrist.bdd.twitter.pages.TwitterLoginPage;

import net.thucydides.core.steps.ScenarioSteps;

/**
 * Scenario Steps for the Twitter login process.
 * 
 * Contains several steps to login into the Twitter account.
 * 
 * @see TwitterHomePage
 * @see TwitterLoginPage
 * @see TwitterErrorPage
 * 
 * @author sigrist
 *
 */

public class LoginScenarioSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7102709836099136851L;

	/** The Twitter home page */
	private TwitterHomePage twitterHomePage;

	/** The Twitter error page */
	private TwitterErrorPage twitterErrorPage;

	/**
	 * Performs the login
	 */
	public void login() {
		twitterHomePage.submit();
	}

	/**
	 * Opens the Twitter Home Page
	 */
	public void goToHomePage() {
		twitterHomePage.open();
	}

	/**
	 * Fills email and password fields
	 * 
	 * @param email
	 *            The email and username
	 * @param password
	 *            The password
	 */
	public void entersEmailAndPassword(String email, String password) {
		twitterHomePage.fillEmail(email);
		twitterHomePage.fillPassword(password);
	}

	/**
	 * Checks the content of the error message
	 * 
	 * @param message
	 *            The message to validate
	 * @return true if the message is valid
	 */
	public boolean checkErrorMessage(String message) {
		return twitterErrorPage.checkMessage(message);
	}
}
