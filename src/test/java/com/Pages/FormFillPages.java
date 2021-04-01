package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormFillPages {
	FormFillPages SP;
	
	public WebDriver driver;

	public FormFillPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}


	
	
	
}
