package com.StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Common.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RCNLogin extends Base {
	
		@Test
	  @Given("^I am on RCN Login Page$")
	    public void i_am_on_rcn_login_page()  {
		  getdriver2();
	        
	    }

	  @And("^I enter username and password$")
	  public void i_enter_username_and_password(DataTable creds) throws Throwable {
			List <Map <String,String>> data= creds.asMaps(String.class,String.class);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get(0).get("username"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get("password"));
		   
		        
		    }
		
	    @When("^I click enter$")
	    public void i_click_enter()  {
	        
	    }

	    @Then("^I should recieve an error message$")
	    public void i_should_recieve_an_error_message() {
	        
	    }

	   

	
	
	

}
