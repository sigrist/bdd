package com.github.sigrist.bdd.twitter.steps;

import net.thucydides.core.steps.ScenarioSteps;

import com.github.sigrist.bdd.twitter.pages.TwitterHomePage;

/**
 * Scenario Steps for the Twitter home page.
 * 
 * Contains several steps to be used when using the Twitter home page.
 * 
 * @see TwitterHomePage
 * @author sigrist
 *
 */
public class HomePageScenariosSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1529645266068481099L;

	/** The Twitter Home Page */
	private TwitterHomePage homePage;

	/**
	 * Checks the user name
	 * 
	 * @param name
	 *            The user name to check
	 * @return true if the name is valid
	 */
	public boolean checkUserName(String name) {
		return this.homePage.getDashboardProfileCard().checkUserName(name);
	}

	/**
	 * Checks the screen name
	 * 
	 * @param name
	 *            The screen name to check
	 * @return true if the name is valid
	 */
	public boolean checkScreenName(String name) {
		return this.homePage.getDashboardProfileCard().checkScreenName(name);
	}

}
