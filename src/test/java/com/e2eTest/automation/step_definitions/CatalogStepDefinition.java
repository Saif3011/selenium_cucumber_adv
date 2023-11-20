package com.e2eTest.automation.step_definitions;

import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.page_Objects.AuthentificationPage;
import com.e2eTest.automation.page_Objects.CatalogPage;
import com.e2eTest.automation.page_Objects.ManufacturerPage;
import com.e2eTest.automation.utils.Random;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private CatalogPage catalogPage;
	private ManufacturerPage manufacturerPage;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		validations = new Validations();
		manufacturerPage = new ManufacturerPage();
	}

	/* TC01_PRODUCT */
	@When("Je click sur le boutton catalog")
	public void jeClickSurLeBouttonCatalog() {
		seleniumUtils.click(CatalogPage.getCatalogBtn());
	}

	@When("Je click sur le boutton Product")
	public void jeClickSurLeBouttonProduct() {
		seleniumUtils.click(CatalogPage.getproductBtn());
	}

	@When("Je saisie le nom du produit recherché {string} dans le champ Product Name")
	public void jeSaisieLeNomDuProduitRecherchéDansLeChampProductName(String productName) {
		seleniumUtils.writeText(CatalogPage.getInputSearchProduct(), productName);
	}

	@When("Je clique sur le boutton Search")
	public void jeCliqueSurLeBouttonSearch() {
		seleniumUtils.click(CatalogPage.getSearchBtn());
	}

	@Then("Le produit recherché est affiché avec détails")
	public void leProduitRecherchéEstAffichéAvecDétails() {
		String productNameTxt = CatalogPage.getProductName().getText();
		Assert.assertTrue(productNameTxt.contains("Asus"));

	}

	/* TC_02 CATEGORIES */

	@When("Je clique sur le boutton Categories")
	public void jeCliqueSurLeBouttonCategories() {
		seleniumUtils.click(CatalogPage.getCategorieBtn());

	}

	@When("Je clique sur le boutton Add new")
	public void jeCliqueSurLeBouttonAddNew() {
		seleniumUtils.click(CatalogPage.getAddNewBtn());

	}

	@When("Je saisie sur le nom {string} et la description {string}")
	public void jeSaisieSurLeNomEtLaDescription(String nom, String description) throws Exception {
		seleniumUtils.writeText(CatalogPage.getInputName(), nom);

	}

	@When("Je selectionne la categorie parent")
	public void jeSelectionneLaCategorieParent() {
		// seleniumUtils.click(CatalogPage.getParentCategory());
		seleniumUtils.selectOptionWithText("Desktops", CatalogPage.getParentCategory(),
				By.xpath("//select[@id='ParentCategoryId']"));

	}

	@When("Je telecharge l image")
	public void jeTelechargeLImage() {

		seleniumUtils.writeText(CatalogPage.getUploadFileBtn(), "D:\\test tools\\hedi.jpg");

	}

	@When("Je clique sur le boutton Save")
	public void jeCliqueSurLeBouttonSave() {

		seleniumUtils.click(CatalogPage.getSaveBtn());

	}

	@Then("Le nom de la categorie sera affiche dans la liste des categories")
	public void leNomDeLaCategorieSeraAfficheDansLaListeDesCategories() {

	}
	/* TC03_MANUFACTURER */

	@When("Je clique sur le boutton  manufacturers")
	public void jeCliqueSurLeBouttonManufacturers() {
		seleniumUtils.click(ManufacturerPage.getManufacturersBtn());
	}

	@When("Je clique sur le boutton Add new du page manufacturers")
	public void jeCliqueSurLeBouttonAddNewDuPageManufacturers() {
		seleniumUtils.click(ManufacturerPage.getAddNewBtnManufacturer());
	}

	@When("Je saisie le nom du manufacturers")
	public void jeSaisieLeNomDuManufacturers() {
		seleniumUtils.writeText(ManufacturerPage.getInputNameManufacturer(), Random.RandomFirstName());

	}

	@When("Je saisie la description du manufacturers")
	public void jeSaisieLaDescriptionDuManufacturers() throws Exception {
		
		
		seleniumUtils.click(ManufacturerPage.getInputDescriptionManufacturer());
		Thread.sleep(20000);
		seleniumUtils.switchToNewIframe(Setup.getDriver(),"Description_ifr");
		Thread.sleep(20000);
		seleniumUtils.writeText(ManufacturerPage.getInputDescriptionManufacturer(), "hello");
		Setup.getDriver().switchTo().activeElement().sendKeys("hello");
		//seleniumUtils.writeText(ManufacturerPage.getInputDescriptionManufacturer(), "hello");
		Setup.getDriver().switchTo().defaultContent();
		
		
		
//		seleniumUtils.switchToNewIframe(Setup.getDriver(), "Description_ifr");
//		seleniumUtils.click(ManufacturerPage.getInputDescriptionManufacturer());
//		Setup.getDriver().switchTo().activeElement().sendKeys("hello");
//		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je click sur le boutton save de la page  manufacturers")
	public void jeClickSurLeBouttonSaveDeLaPageManufacturers() {

	}

	@Then("un message {string} est affiche")
	public void unMessageEstAffiche(String string) {

	}

}