package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_Objects.AuthentificationPage;
import com.e2eTest.automation.page_Objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationMultiuserStepDefinition {
	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private CatalogPage catalogPage;

	public AuthentificationMultiuserStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
	}

	@When("je saisis le password {string}")
	public void jeSaisisLePassword(String value) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), value);
	}

	@When("je clique sur le boutton Log In")
	public void jeCliqueSurLeBouttonLogIn() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());
	}
	
}