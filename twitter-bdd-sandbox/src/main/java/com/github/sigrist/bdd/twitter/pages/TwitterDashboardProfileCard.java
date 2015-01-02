package com.github.sigrist.bdd.twitter.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

/**
 * Twitter Dashboard Profile Card widget.
 * 
 * Compoenent in the home page of twitter with information about the user
 * profile, such user name, scrren name, number of twittes, followers and
 * following.
 * 
 * @author sigrist
 *
 */
public class TwitterDashboardProfileCard extends PageObject {

	/**
	 * WebElement to represents the user name.
	 */
	@FindBy(css = "#page-container > div.dashboard.dashboard-left.home-exp-tweetbox > div.DashboardProfileCard.module > div > div.DashboardProfileCard-userFields > div > a")
	private WebElement userName;

	/**
	 * WebElement to represents the screen name.
	 */
	@FindBy(css = "#page-container > div.dashboard.dashboard-left.home-exp-tweetbox > div.DashboardProfileCard.module > div > div.DashboardProfileCard-userFields > span > a > span")
	private WebElement screenName;

	/**
	 * Checks text inside the {@link #userName} element is parameter name
	 * 
	 * @param value
	 *            The value to validate
	 * @return true if value is valid
	 */
	public boolean checkUserName(String value) {
		return element(this.userName).containsOnlyText(value);
	}

	/**
	 * Checks text inside the {@link #screenName} element is parameter name
	 * 
	 * @param value
	 *            The value to validate
	 * @return true if value is valid
	 */
	public boolean checkScreenName(String value) {
		return element(this.screenName).containsOnlyText(value);
	}

}
