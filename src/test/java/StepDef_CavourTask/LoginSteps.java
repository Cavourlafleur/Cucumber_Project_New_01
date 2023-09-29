package StepDef_CavourTask;

import Page_CavourTask.CavourPOM;
import Page_CavourTask.DialogCavour;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {

    DialogCavour dialogCavour = new DialogCavour();
    CavourPOM CavourPOM = new CavourPOM();

    @And("Enter email and password")
    public void enterEmailAndPassword()  {
CavourPOM.sendKeysMethod(CavourPOM.getEnterEmail(),"lafleur@yahoo.com");
        CavourPOM.waitMethod(2);

CavourPOM.sendKeysMethod(CavourPOM.getEnterPassword(),"coding123$");
        CavourPOM.waitMethod(2);


        

    }

    @Given("Navigate to shopping website")
    public void navigateToShoppingWebsite() {
        DriverClass.getDriver().get("https://cleverppc.com/prestashop4/. ");

    }

    @When("Click on  sign in button")
    public void clickOnSignInButton()  {
        CavourPOM.clickMethod(CavourPOM.getSignInButtonToWeb());
        CavourPOM.waitMethod(2);

    }




    @Then("Click on  sign button to sign in")
    public void clickOnSignButtonToSignIn()  {
        CavourPOM.clickMethod(CavourPOM.getSignInButton());
        CavourPOM.waitMethod(3);

    }

    @When("Click on site")
    public void clickOnSite() {
        CavourPOM.clickMethod(CavourPOM.getSiteMapButton());
    }

    @Then("Click on addresses")
    public void clickOnAddresses() {
        CavourPOM.clickMethod(CavourPOM.getAddressesButton());
    }

    @And("Add  a new address")
    public void addANewAddress() {
        CavourPOM.clickMethod(CavourPOM.getAddAddressButton());
    }



    @Then("User should login successfully in Ecommerce page")
    public void userShouldLoginSuccessfullyInEcommercePage() {

        CavourPOM.waitUntilVisible(CavourPOM.getAccountHeader());
        Assert.assertTrue(CavourPOM.getAccountHeader().isDisplayed());
    }


    @Then("Enter address mandatory information")
    public void enterAddressMandatoryInformation(DataTable dataTable) {

        List<String>myAddress= dataTable.asList(String.class);
CavourPOM.sendKeysMethod(CavourPOM.getInsertAddress(),myAddress.get(0));
CavourPOM.sendKeysMethod(CavourPOM.getInsertCity(),myAddress.get(1));
        CavourPOM.clickMethod(CavourPOM.getDropMenuState());
//        Select  select = new Select(CavourPOM.getDropMenuState());
//        select.selectByVisibleText("Virginia");



CavourPOM.sendKeysMethod(CavourPOM.getZipCode(),myAddress.get(2));

CavourPOM.sendKeysMethod(CavourPOM.getPhoneNumber(),myAddress.get(3));



    }

    @Then("Click on save button")
    public void clickOnSaveButton() {
        CavourPOM.clickMethod(CavourPOM.getSaveButton());
        CavourPOM.waitMethod(2);


    }
}

