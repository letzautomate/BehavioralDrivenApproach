package com.letzautomate.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.letzautomate.constants.SeleniumConstants;

public class WebDriverInstance {
	
	WebDriver driver;
	public WebDriverInstance(){
		System.setProperty(SeleniumConstants.CHROMEDRIVER_KEY, SeleniumConstants.chromeDriver);
		driver = new ChromeDriver();
	}

}
