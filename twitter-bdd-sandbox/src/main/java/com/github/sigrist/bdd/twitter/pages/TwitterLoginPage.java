package com.github.sigrist.bdd.twitter.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

/**
 * Twitter login page.
 * 
 * When in the twitter home page and the user is not logged in, the Twitter
 * Login form is visible.
 * 
 * @author sigrist
 *
 */
public class TwitterLoginPage extends PageObject {
	/**
	 * WebElement to represents the email/username field.
	 */
	@FindBy(id = "signin-email")
	private WebElement signinEmail;

	/**
	 * WebElement to represents the passwrod field.
	 */
	@FindBy(id = "signin-password")
	private WebElement signinPassword;

	/**
	 * WebElement to represents the submit button.
	 */
	@FindBy(xpath = "//*[@id=\"front-container\"]/div[2]/div[2]/form/table/tbody/tr/td[2]/button")
	private WebElement submitButton;

	/**
	 * Fill the {@link #signinEmail} with the parameter email
	 * 
	 * @param email
	 *            The email value
	 */
	public void fillEmail(String email) {
		typeInto(this.signinEmail, email);
	}

	/**
	 * Fill the {@link #signinPassword} with the parameter password
	 * 
	 * @param email
	 *            The password value
	 */
	public void fillPassword(String password) {
		typeInto(this.signinPassword, password);
	}

	/**
	 * Perform a click in the {@link #submitButton}
	 * 
	 * @return this current PageObject
	 */
	public PageObject submit() {
		clickOn(submitButton);

		return this;
	}

}
