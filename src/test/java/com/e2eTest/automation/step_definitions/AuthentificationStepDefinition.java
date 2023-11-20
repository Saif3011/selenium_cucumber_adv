package com.e2eTest.automation.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.e2eTest.automation.page_Objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AuthentificationStepDefinition {
	/*Best practice:  declaration du variable puis dans instatanciation de l'objet dans le constructor */
	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;
	
	
	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	/* TC_01 */
	@Given("Je me connecte sur l application nopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));

	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(authentificationPage.getEmail(), email);

	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(authentificationPage.getPassword(), password);

	}

	@When("Je clique sur le boutton Log In")
	public void jeCliqueSurLeBouttonLogIn() {
		seleniumUtils.click(authentificationPage.getBtnLogin());

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String WelcomeHome) {
		String textWelcome = authentificationPage.getDashboard().getText();
		 Assert.assertEquals(textWelcome,WelcomeHome );
		 

		 




	}

	
	/* TC_02  invalid */
	
	@Then("Je verifie le message d erreur {string}")
	public void je_verifie_le_message_d_erreur(String text) {
		
		 String message = authentificationPage.getAlertMessage().getText();
		 Assert.assertEquals(message,text);
		
	    
	}
	
	/* TC_03 *logout **/
	@When("Je clique sur le boutton Log Out")
	public void je_clique_sur_le_boutton_log_out() {
		seleniumUtils.click(authentificationPage.getBtnLogout());

	}
	

	

}
