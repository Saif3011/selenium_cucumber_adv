package com.e2eTest.automation.page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AuthentificationPage extends BasePage {

	/* Retrieve web elements */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;
	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = "//a[@href='/logout']")
	private static WebElement btnLogout;
	@FindBy(how = How.XPATH, using = "//div[@class='message-error validation-summary-errors']")
	private static WebElement erreurMessage;
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	private static WebElement Dashboard;

	// constructor
	public AuthentificationPage() {
		super(Setup.getDriver());

	}

	// Methods - getter
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	

	public static WebElement getBtnLogout() {
		return btnLogout;
	}

	public static WebElement getAlertMessage() {
		return erreurMessage;
	}

	public static WebElement getDashboard() {
		return Dashboard;
	}

}
