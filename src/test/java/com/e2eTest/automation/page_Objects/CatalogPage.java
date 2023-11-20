package com.e2eTest.automation.page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage {

	/* product elements */
	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement InputSearchProduct;
	@FindBy(how = How.XPATH, using = "//button[@id='search-products']//i[@class='fas fa-search']")
	private static WebElement SearchProductBtn;
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement CatalogBtn;
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement productBtn;
	@FindBy(how = How.XPATH, using = "//td[normalize-space()='Asus N551JK-XO076H Laptop']")
	private static WebElement productName;
	
	/*categories elements*/
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categorieBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement addNewBtn;
	@FindBy(how = How.ID, using = "Name")
	private static WebElement InputName;
	@FindBy(how = How.XPATH, using = "//*[@data-id='Description']") 
	private static WebElement InputDescription;
	@FindBy(how = How.XPATH, using = "//select[@id='ParentCategoryId']")
	private static WebElement parentCategory;
	@FindBy(how = How.CSS, using = "input[title='file input']")
	private static WebElement uploadFileBtn;
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement saveBtn;
	
	
	public CatalogPage() {
		super(Setup.getDriver());

	}

	/*product method*/
	public static WebElement getInputSearchProduct() {
		return InputSearchProduct;
	}

	public static WebElement getSearchBtn() {
		return SearchProductBtn;
	}
	public static WebElement getproductBtn() {
		return productBtn;
	}

	public static WebElement getCatalogBtn() {
		return CatalogBtn;
	}
	public static WebElement getProductName() {
		return productName;
	}
	
	
	/*categories methods*/
	public static WebElement getCategorieBtn() {
		return categorieBtn;
	}
	public static WebElement getAddNewBtn() {
		return addNewBtn;
	}
	
	public static WebElement getInputName() {
		return InputName;
	}
	public static WebElement getInputDescription() {
		return InputDescription;
	}
	public static WebElement getParentCategory() {
		return parentCategory;
	}
	public static WebElement getUploadFileBtn() {
		return uploadFileBtn;
	}
	public static WebElement getSaveBtn() {
		return saveBtn;
	}

}