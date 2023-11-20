package com.e2eTest.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

/**
 * This method is used to close browser. This method is called after the
 * invocation of each test method in given class.
 * 
 * @After Methods annotated with @After execute after every scenario.
 */

public class TearDown {
	
	public void quitDriver(Scenario scenario) {
		
		if(scenario.isFailed()) {
			final byte [] screenShot =((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "screenShot : " +scenario.getName());
		}
		
		
		Setup.getDriver().quit();
		Setup.getLogger().info("Scenario :" +scenario.getName() + "- finished.Status: " +scenario.getStatus());
		
	}
	
	

}
