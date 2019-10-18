package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.Basepage;
import com.cucumber.pom.Homepage;
import com.cucumber.testrunner.Testrunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;


public class Stepdefinition extends Basepage{
	
	
	@Given("^user should login the womens page$")
	public void user_should_login_the_womens_page() throws Throwable {
		
		Homepage hp = new Homepage();
	  
	}

	@When("^user should the click the womens tab$")
	public void user_should_the_click_the_womens_tab() throws Throwable {
		
		Homepage hp = new Homepage();
		hp.getwomen().click();
	    
	}

	@Then("^user should verify the womens tab$")
	public void user_should_verify_the_womens_tab() throws Throwable {
		
		Homepage hp = new Homepage();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
	
	 
		
	    
	}



}
