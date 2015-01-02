package com.github.sigrist.bdd.twitter.jbehave.steps;

import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import net.thucydides.core.annotations.Steps;

import com.github.sigrist.bdd.twitter.steps.HomePageScenariosSteps;

public class HomePageStepsTest {

	@Steps
	private HomePageScenariosSteps homePageScenariosSteps;
	
	@Then("the user name must be '$userName'")
	public void checkUserName(String userName) {
		Assert.assertTrue(homePageScenariosSteps.checkUserName(userName));
	}
	
	@Then("the screen name must be '$screenName'")
	public void checkScreenName(String screenName) {
		Assert.assertTrue(homePageScenariosSteps.checkScreenName(screenName));
	}

}
