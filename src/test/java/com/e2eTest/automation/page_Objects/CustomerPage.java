package com.e2eTest.automation.page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CustomerPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement CustomerBtn;
	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement CustomerOption;
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")  
	private static WebElement AddnewBtnCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	private static WebElement emailInputCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	private static WebElement passwordInputCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='FirstName']")
	private static WebElement nameInputCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='LastName']")
	private static WebElement lastNameInputCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='Gender_Male']")
	private static WebElement genderMaleCustomer;
	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-calendar']")
	private static WebElement birthDayCustomer;
	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	private static WebElement birthDayImputCustomer;
	@FindBy(how = How.XPATH, using = "//a[@title='Wednesday, November 8, 2023']")
	private static WebElement date;
	@FindBy(how = How.XPATH, using = "//button[@name='save']") 
	private static WebElement saveBtnCostumer;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement welcomeMessage;

	public CustomerPage() {
		super(Setup.getDriver());

	}

	public static WebElement getCustomerBtn() {
		return CustomerBtn;
	}

	public static WebElement getCustomerOption() {
		return CustomerOption;
	}

	public static WebElement getAddnewBtnCustomer() {
		return AddnewBtnCustomer;
	}

	public static WebElement getEmailInputCustomer() {
		return emailInputCustomer;
	}

	public static WebElement getPasswordInputCustomer() {
		return passwordInputCustomer;
	}

	public static WebElement getnameInputCustomer() {
		return nameInputCustomer;
	}

	public static WebElement getlastNameInputCustomer() {
		return lastNameInputCustomer;
	}

	public static WebElement getGenderMaleCustomer() {
		return genderMaleCustomer;
	}

	public static WebElement getBirthDayCustomer() {
		return birthDayCustomer;
	}

	public static WebElement getDateBirthCustomer() {
		return date;
	}

	public static WebElement getSaveBtnCostumer() {
		return saveBtnCostumer;
	}

	public static WebElement getWelcomeMessage() {
		return welcomeMessage;
	}

	public static WebElement getbirthDayImputCustomer() {
		return birthDayImputCustomer;
	}

}
