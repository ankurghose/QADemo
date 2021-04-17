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

	@FindBy(xpath="//button[@id='submit']")
	public WebElement SubmitButton;

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	@FindBy(xpath="//input[@id='lastName']")
	public WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(xpath="//label[contains(text(),'Male')]")
	public WebElement Gender;
	
	public WebElement getGender() {
		return Gender;
	}
	
	@FindBy(xpath="//input[@id='userNumber']")
	public WebElement MobileNumber;

	public WebElement getMobileNumber() {
		return MobileNumber;
	}
	
	@FindBy(xpath="//button[@id='closeLargeModal']")
	public WebElement PopUpClose;

	public WebElement getPopUpClose() {
		return PopUpClose;
	}
	
	
	
	
}
