package com.github.sigrist.bdd.twitter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Twitter home page.
 * 
 * Contains several other PageObjects elements to represent the page, like the
 * signin form or the dashboard profile card. Also has some methods do perform
 * actions in the main screen, like login, send a twitter, etc.
 * 
 * @author sigrist
 *
 */
@DefaultUrl("http://www.twitter.com")
public class TwitterHomePage extends PageObject {

	/**
	 * The Dashboard profile card
	 */
	private TwitterDashboardProfileCard dashboardProfileCard;

	/**
	 * The Login Page
	 */
	private TwitterLoginPage loginPage;

	/**
	 * Calls {@link TwitterLoginPage#fillEmail(String)}
	 * 
	 * @param email
	 *            The email value
	 */
	public void fillEmail(String email) {
		loginPage.fillEmail(email);
	}

	/**
	 * Calls {@link TwitterLoginPage#fillPassword(String)}
	 * 
	 * @param password
	 *            The password value
	 */
	public void fillPassword(String password) {
		loginPage.fillPassword(password);
	}

	/**
	 * Calls {@link TwitterLoginPage#submit()}
	 * 
	 * @return this PageObject
	 */
	public PageObject submit() {
		loginPage.submit();
		return this;
	}

	public TwitterDashboardProfileCard getDashboardProfileCard() {
		return dashboardProfileCard;
	}
}
