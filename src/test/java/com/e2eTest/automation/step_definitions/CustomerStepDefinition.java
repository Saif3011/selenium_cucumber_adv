package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_Objects.CustomerPage;

import org.junit.Assert;

import com.e2eTest.automation.page_Objects.AuthentificationPage;
import com.e2eTest.automation.page_Objects.CatalogPage;
import com.e2eTest.automation.page_Objects.CostumerRolePage;
import com.e2eTest.automation.utils.Random;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDefinition {

	private CustomerPage customerPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private CostumerRolePage costumerRolePage;

	public CustomerStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		customerPage = new CustomerPage();
		costumerRolePage = new CostumerRolePage();
	}

	/* TC_1 : AjoutCostumer */

	@When("Je clique sur le boutton Customer")
	public void jeCliqueSurLeBouttonCustomer() {
		seleniumUtils.click(CustomerPage.getCustomerBtn());

	}

	@When("Je selectionne l option Customer")
	public void jeSelectionneLOptionCustomer() {
		seleniumUtils.click(CustomerPage.getCustomerOption());

	}

	@When("Je clique sur le boutton Addnew")
	public void jeCliqueSurLeBouttonAddnew() {
		seleniumUtils.click(CustomerPage.getAddnewBtnCustomer());

	}

	@When("Je saisie l email {string}")
	public void jeSaisieLEmail(String emailConstumer) {
		Random random = new Random();
		seleniumUtils.writeText(CustomerPage.getEmailInputCustomer(), random.RandomEmail());

	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String passwordConstumer) {
		seleniumUtils.writeText(CustomerPage.getPasswordInputCustomer(), passwordConstumer);

	}

	@When("Je saisie le nom {string}")
	public void jeSaisieLeNom(String ConstumerName) {
		seleniumUtils.writeText(CustomerPage.getnameInputCustomer(), Random.RandomFirstName());

	}

	@When("Je saisie le prenom {string}")
	public void jeSaisieLePrenom(String ConstumerLastName) {

		seleniumUtils.writeText(CustomerPage.getlastNameInputCustomer(), Random.RandomLastName());
	}

	@When("Je choisie le genre")
	public void jeChoisieLeGenre() {

		seleniumUtils.click(CustomerPage.getGenderMaleCustomer());
	}

	@When("Je choisis date de naissance")
	public void jeChoisisDateDeNaissance() {
		seleniumUtils.click(CustomerPage.getBirthDayCustomer());
		seleniumUtils.click(CustomerPage.getbirthDayImputCustomer());
		seleniumUtils.click(CustomerPage.getDateBirthCustomer());

	}

	@When("Je clique sur Save")
	public void jeCliqueSurSave() {

		seleniumUtils.click(CustomerPage.getSaveBtnCostumer());
	}

	@Then("Un message {string} est affiché en haut")
	public void unMessageEstAffichéEnHaut(String WelcomeMessage) {
		Assert.assertTrue(WelcomeMessage.contains(" successfully"));

	}

	/* TC_2 :Costumer Role */

	@When("Je clique sur le boutton Customer roles")
	public void jeCliqueSurLeBouttonCustomerRoles() {

		seleniumUtils.click(CostumerRolePage.getCostumerRoleBtn());
	}

	@When("Je saisie le nom {string} sur le champ name")
	public void jeSaisieLeNomSurLeChampName(String string) {
		seleniumUtils.writeText(CostumerRolePage.getInputCustomerRoleName(), Random.RandomFirstName());
	}

	@When("Je coche le check box Free shipping")
	public void jeCocheLeCheckBoxFreeShipping() {

		seleniumUtils.click(CostumerRolePage.getfreeShippingCheckBox());
	}

	@When("Je coche le check box Override default tax display type")
	public void jeCocheLeCheckBoxOverrideDefaultTaxDisplayType() {
		seleniumUtils.click(CostumerRolePage.getOverrideTaxDisplayTypeCheckBox());

	}

	@When("Je selectionne l option Excluding tax")
	public void jeSelectionneLOptionExcludingTax() {
		seleniumUtils.selectDropDownListByVisibleText(CostumerRolePage.getTaxSelect(), "Excluding tax");

	}

	@When("Je clique sur le boutton choose a product")
	public void jeCliqueSurLeBouttonChooseAProduct() {

		String originalWindow = Setup.getDriver().getWindowHandle();
		seleniumUtils.click(CostumerRolePage.getChooseProductBtn());

		for (String windowHandle : Setup.getDriver().getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				Setup.getDriver().switchTo().window(windowHandle);
				break;
			}
		}

		seleniumUtils.click(CostumerRolePage.getProductNameSelection());

		Setup.getDriver().switchTo().window(originalWindow);
	}

	@When("Je clique sur le boutton Save page costumer role")
	public void jeCliqueSurLeBouttonSavePageCostumerRole() throws InterruptedException {
		
		seleniumUtils.waitForElementToBeClickable(CustomerPage.getSaveBtnCostumer());
		seleniumUtils.click(CustomerPage.getSaveBtnCostumer());
	}
	

	@Then("Un message {string} est affiché en haut de la page customer role")
	public void unMessageEstAffichéEnHautDeLaPageCustomerRole(String WelcomeMessage1) {
		Assert.assertTrue(WelcomeMessage1.equals("The new customer role has been added successfully."));
	}



}
