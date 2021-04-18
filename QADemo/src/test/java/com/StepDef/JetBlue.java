package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Common.Base;
import com.Pages.FormFillPages;
import com.Pages.JetBluePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JetBlue extends Base {
JetBluePages JBP;
	
	@Test
	@Given("^I am JetBlue Search Flight site$")
	public void i_am_JetBlue_Search_Flight_site() {
	    getdriver3();
	    
	    JBP = PageFactory.initElements(driver, JetBluePages.class);
	    
	    driver.findElement(By.xpath("//a[@class='call']")).sendKeys(Keys.RETURN);
	  //  JBP.Cookies.click();
	    
	}

	@Given("^I search from NYC to Boston MA$")
	public void i_search_from_NYC_to_Boston_MA()  {
	   
	}

	@When("^I click Search Flights$")
	public void i_click_Search_Flights()  {
	    
	}

	@Then("^I should be taken to Departing Flights$")
	public void i_should_be_taken_to_Departing_Flights()  {
	 
	}

	@Given("^I search from NYC to Boston MA and add users$")
	public void i_search_from_NYC_to_Boston_MA_and_add_users()  {
	  
	}


}
