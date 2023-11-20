package com.e2eTest.automation.page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CostumerRolePage extends BasePage {
	

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customer roles']")
	private static WebElement costumerRoleBtn;
	@FindBy(how = How.XPATH, using = "//input[@id='Name']")
	private static WebElement inputCustomerRoleName;
	@FindBy(how = How.XPATH, using = "//input[@id='FreeShipping']")
	private static WebElement freeShippingCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='OverrideTaxDisplayType']")
	private static WebElement OverrideTaxDisplayTypeCheckBox;
	@FindBy(how = How.XPATH, using = "//select[@id='DefaultTaxDisplayTypeId']")
	private static WebElement taxSelect;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Choose a product']")
	private static WebElement chooseProductBtn;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/button[1]")
	private static WebElement productNameSelection;
	
	public CostumerRolePage() {
		super(Setup.getDriver());

	}
	
	
	public static WebElement getCostumerRoleBtn() {

		return costumerRoleBtn;
	}
	public static WebElement getInputCustomerRoleName() {

		return inputCustomerRoleName;
	}

	public static WebElement getfreeShippingCheckBox() {

		return freeShippingCheckBox;
	}

	public static WebElement getOverrideTaxDisplayTypeCheckBox() {

		return OverrideTaxDisplayTypeCheckBox;
	}

	public static WebElement getTaxSelect() {

		return taxSelect;
	}

	public static WebElement getChooseProductBtn() {

		return chooseProductBtn;
	}
	public static WebElement getProductNameSelection() {

		return productNameSelection;
	}

}
