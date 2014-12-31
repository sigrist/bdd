package com.github.sigrist.bdd.twitter.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://twitter.com/login/error")
public class TwitterErrorPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"message-drawer\"]/div/div/span")
	private WebElement errorMessage;
	
	public boolean checkMessage(String message) {
		return element(errorMessage).containsOnlyText(message);
	}
}
