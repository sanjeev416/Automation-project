package Stepdefinition;

import cucumber.api.java.en.*;
import utility.Basepage;
import utility.Homepageobject;

public class Homepagetest {

	Basepage bp;
	Homepageobject hp;
	
	public Homepagetest()
	{
		hp = new Homepageobject();
		}
	
	@Given("^user should launch the application$")
	public void user_should_launch_the_application() throws Throwable {
	    
	}

	@When("^user should click on the tabs$")
	public void user_should_click_on_the_tabs() throws Throwable {
	   
	}

	@Then("^user should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {

	}


	    
	}


