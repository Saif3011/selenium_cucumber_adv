package com.e2eTest.automation.page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class ManufacturerPage extends BasePage {

	@FindBy(how=How.XPATH , using ="//p[normalize-space()='Manufacturers'] ") 
	private static WebElement manufacturersBtn;
	
	@FindBy(how=How.XPATH , using =" //a[@class='btn btn-primary']")
	private static WebElement addNewBtnManufacturer ;
	
	@FindBy(how=How.ID , using ="Name")
	private static WebElement inputNameManufacturer;
	@FindBy(how=How.ID , using ="Description_ifr")//br[@data-mce-bogus='1']
	private static WebElement inputDescriptionManufacturer ;
	@FindBy(how=How.XPATH , using ="//button[@name='save']")
	private static WebElement saveBtnManufacturer ;
	
	public ManufacturerPage() {
		super(Setup.getDriver());
		
	}

	public static WebElement getManufacturersBtn() {
		return manufacturersBtn;
	}
	
	public static WebElement getAddNewBtnManufacturer() {
		return addNewBtnManufacturer;
	}
	public static WebElement getInputNameManufacturer() {
		return inputNameManufacturer;
	}
	public static WebElement getInputDescriptionManufacturer() {
		return inputDescriptionManufacturer;
	}
	public static WebElement getSaveBtnManufacturer() {
		return saveBtnManufacturer;
	}
	
	
	
}
