package com.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	public WebDriver getdriver() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver88");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

	public WebDriver getdriver2() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver88");
		driver = new ChromeDriver();

		driver.get("https://my.rcn.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

	public WebDriver getdriver3() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver88");
		driver = new ChromeDriver();

		driver.get("https://www.jetblue.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public WebDriver getdriver4() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver90");
		driver = new ChromeDriver();

		driver.get("https://test.crowdstreet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
