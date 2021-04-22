package com.StepDef;

import org.testng.annotations.Test;

import com.Common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrowdStreet extends Base {
	
	@Test
	@Given("^I am on the CrowdStreet Website$")
	public void i_am_on_the_CrowdStreet_Website()  {
		getdriver4();
		
	 String Title =   driver.getCurrentUrl();
	 System.out.println(Title);
		
	}
	
	@Given("^I click on Create An Account$")
	public void i_click_on_Create_An_Account()  {
	   
	}

	@When("^I complete the form and click on Sign Up$")
	public void i_complete_the_form_and_click_on_Sign_Up()  {
	   
	}

	@Then("^my account should be created$")
	public void my_account_should_be_created()  {
	    
	}


}
