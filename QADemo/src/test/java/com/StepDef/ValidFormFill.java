package com.StepDef;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Common.Base;
import com.Pages.FormFillPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ValidFormFill extends Base {
FormFillPages ffp;
	
	
	
	@Test
	@Given("^I am on the Test QA Form Page$")
	public void i_am_on_the_Test_QA_Form_Page() {
		getdriver();
		 ffp = PageFactory.initElements(driver, FormFillPages.class);
		
	}

	
	@Given("^I start to fill out the form$")
	public void i_start_to_fill_out_the_form()  {
		
		ffp.FirstName.sendKeys("Blue");
		ffp.LastName.sendKeys("G");
		ffp.Gender.click();
		ffp.MobileNumber.sendKeys("7187187188");
		
		
		
	}
	
	@When("^I complete the form and hit submit$")
	public void i_complete_the_form_and_hit_submit()   {
	
		ffp.SubmitButton.sendKeys(Keys.RETURN);
		
		
	}

	
	@Then("^I validate the pop up after submit$")
	public void i_validate_the_pop_up_after_submit() throws InterruptedException  {
	   
		Thread.sleep(5000);
		String PopUp = ffp.PopUpClose.getText();
		System.out.println(PopUp);
		ffp.PopUpClose.click();
		driver.close();
		
	}

}
