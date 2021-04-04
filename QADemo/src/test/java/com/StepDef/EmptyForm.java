package com.StepDef;

import org.testng.annotations.Test;

import com.Common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmptyForm  extends Base{
	
	
	
	@Test
	
	@Given("^I scroll down to submit button$")
	public void i_scroll_down_to_submit_button() {
	    getdriver();
	    
	    
	    
	}

	@When("^I click submit$")
	public void i_click_submit()  {
	    
	}

	@When("^I get all red box$")
	public void i_get_all_red_box()  {
	    
	}

	@Then("^I validate the mandatory fields are in red$")
	public void i_validate_the_mandatory_fields_are_in_red()  {
	    
	}



}
