package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_Objects.AuthenticationExcel;
import com.e2eTest.automation.page_Objects.AuthentificationPage;
import com.e2eTest.automation.utils.ExcelUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;

public class AuthentificationExcelStepDefinition {
	
	private AuthentificationPage authentificationPage;

	public AuthentificationExcelStepDefinition() {
		authentificationPage = new AuthentificationPage();

	}
	
	
		

		@Given("Je me connecte via le fichier Excel")
		public void jeMeConnecteViaLeFichierExcel() throws Exception {
			AuthenticationExcel.SignInXlsx(Setup.getDriver());
			ExcelUtils.setCellData("Pass", 1, 3);

		}

	    
	}



