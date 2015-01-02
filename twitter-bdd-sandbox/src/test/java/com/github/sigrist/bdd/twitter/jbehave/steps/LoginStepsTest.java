package com.github.sigrist.bdd.twitter.jbehave.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.github.sigrist.bdd.twitter.steps.LoginScenarioSteps;


public class LoginStepsTest {

	@Steps
	private LoginScenarioSteps loginSteps;

	@Given("the user is on the Twitter home page")
	public void givenTheUserIsOnTwitterHomePage() {
		loginSteps.goToHomePage();
	}
	
	@When("the user enters the login $email and password $password")
	public void entersEmailAndPassword(@Named("email") String email, @Named("password") String password) {
		loginSteps.entersEmailAndPassword(email, password);
	}
	
	@When("do the log in")
	public void doLogin() {
		loginSteps.login();
	}
	
	@Then("they should see an error message $message")
	public void shouldSeeErrorMessage(@Named("message") String message) {
		boolean valid = loginSteps.checkErrorMessage(message);
		
		Assert.assertTrue(valid);
	}
	
	
}
