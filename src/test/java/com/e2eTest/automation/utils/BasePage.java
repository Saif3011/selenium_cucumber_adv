package com.e2eTest.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
public BasePage(WebDriver driver) {
	/**
	 * Instanciation de base page.
	 * 
	 * @param driver
	 */
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
}
