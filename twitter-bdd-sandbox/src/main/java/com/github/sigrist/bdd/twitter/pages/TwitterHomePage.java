package com.github.sigrist.bdd.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.twitter.com")
public class TwitterHomePage extends PageObject  {

	@FindBy(id = "signin-email")
	private WebElement signinEmail;

	@FindBy(id = "signin-password")
	private WebElement signinPassword;
	
	@FindBy(xpath="//*[@id=\"front-container\"]/div[2]/div[2]/form/table/tbody/tr/td[2]/button")
	private WebElement submitButton;
	
	public TwitterHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void fillEmail(String email) {
		typeInto(this.signinEmail, email);
	}
	
	public void fillPassword(String password) {
		typeInto(this.signinPassword, password);
	}
	
	public PageObject submit() {
		clickOn(submitButton);
		
		return this;
	}
}
