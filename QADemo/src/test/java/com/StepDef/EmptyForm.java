package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Common.Base;
import com.Pages.FormFillPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmptyForm  extends Base{ 
FormFillPages ffp;
	
	
	@Test
	
	@Given("^I am on the form Page$")
	public void i_am_on_the_form_Page() throws InterruptedException  {
		 getdriver();
		    ffp = PageFactory.initElements(driver, FormFillPages.class);
		
			}
	
	@Given("^I scroll down to submit button$")
	public void i_scroll_down_to_submit_button() {
	  
	  
	    
	}
	
	@Test
	@When("^I click submit$")
	public void i_click_submit()  {
	    
	    ffp.SubmitButton.sendKeys(Keys.RETURN);

		
	}

	@Test
	@When("^I get all red box$")
	public void i_get_all_red_box()  {
		
	   String RedBox =  ffp.FirstName.getCssValue("color");
	   System.out.println(RedBox);
	   
	   String MobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']")).getCssValue("color");
	   System.out.println(MobileNumber);
	   
	  //done
	   
	}

	@Then("^I validate the mandatory fields are in red$")
	public void i_validate_the_mandatory_fields_are_in_red()  {
	    
	}



}
