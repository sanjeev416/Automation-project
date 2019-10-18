package Steps;

import cucumber.api.java.en.*;



public class Test {
	
	
	
	public Test()
	{
		BasePage bp;
		HomePage hp;
	}
	@Given("^user must enter the username annd password$")
	public void user_must_enter_the_username_annd_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   hp= new HomePage();
	}

	@When("^login succesfully$")
	public void login_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user must recieve message$")
	public void user_must_recieve_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
