package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JetBluePages {
	JetBluePages JBP;
	
	public WebDriver driver;

	public JetBluePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@class='call']")
	public WebElement Cookies;

	public WebElement getCookies() {
		return Cookies;
	}
	
	
	
}
