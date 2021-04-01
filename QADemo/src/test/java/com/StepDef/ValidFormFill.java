package com.StepDef;

import org.openqa.selenium.By;
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

	@Test
	@Given("^I start to fill out the form$")
	public void i_start_to_fill_out_the_form()  {
		
		ffp.FirstName.sendKeys("Blue1");
		
		//driver.findElement(By.xpath("//input[@id='firstName']")).click();
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ankur");
		
	}

	@When("^I complete the form and hit submit$")
	public void i_complete_the_form_and_hit_submit() {

	}

	@Then("^I validate the pop after subit$")
	public void i_validate_the_pop_after_subit() {

	}

}
