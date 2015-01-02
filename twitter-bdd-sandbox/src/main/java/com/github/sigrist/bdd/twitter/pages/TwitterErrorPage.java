package com.github.sigrist.bdd.twitter.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

/**
 * The Twitter error page.
 * 
 * When the user performs a login action and the parameters are wrong, twitter
 * redirects the user to this page where an error message is displayed to the
 * user.
 * 
 * @author sigrist
 *
 */
@DefaultUrl("http://twitter.com/login/error")
public class TwitterErrorPage extends PageObject {

	/**
	 * The WebElement that contains the error message
	 */
	@FindBy(xpath = "//*[@id=\"message-drawer\"]/div/div/span")
	private WebElement errorMessage;

	/**
	 * Checks the content of the error message
	 * @param message The error message to validate
	 * @return true if the message is valid
	 */
	public boolean checkMessage(String message) {
		return element(errorMessage).containsOnlyText(message);
	}
}
