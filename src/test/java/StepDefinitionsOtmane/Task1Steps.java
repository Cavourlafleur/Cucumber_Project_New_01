
package StepDefinitionsOtmane;


import PagesOtmane.DialogProjectOtmane;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Task1Steps {


    DialogProjectOtmane dialogProjectOtmane = new DialogProjectOtmane();

    @Given("Navigate to web site")
    public void navigateToWebSite() {
        DriverClass.getDriver().get("https://cleverppc.com/prestashop4/.");
    }

    @And("click on sign in")
    public void clickOnSignIn() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSignIn());

    }

    @And("Enter valid Email")
    public void enterValidEmail() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getEmailValid());
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getEmailValid(), "Fesvegas@gmail.com");
    }

    @And("Click at Create Button")
    public void clickAtCreateButton() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getCreateAccountButton());

    }

    @And("Fill the Form")
    public void fillTheForm() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getMr());
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getFirstName(), "Sam");
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getLastName(), "Mo");
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getPassword(), "Fesvegas@");
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSelectDay());
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSelectMonth());
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSelectYear());
        dialogProjectOtmane.waitUntilClickable(dialogProjectOtmane.getCheckBox());
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getCheckBox());
    }

    @Then("Click at Register Button")
    public void clickAtRegisterButton() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getRegister());
    }

    @Then("Success  Your account has been created.")
    public void successYourAccountHasBeenCreated() {
        dialogProjectOtmane.waitUntilVisible(dialogProjectOtmane.getSuccessMessage());
        Assert.assertTrue(dialogProjectOtmane.getSuccessMessage().isDisplayed());
    }



    @And("Click on the Login Button")
    public void clickOnTheLoginButton() {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSignInButton());
    }

    @Then("User should login")
    public void userShouldLogin() {
        Assert.assertTrue(dialogProjectOtmane.getMYACCOUNT().isDisplayed());
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String Email, String password) {
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getEmailAddress(), Email);
        dialogProjectOtmane.sendKeysMethod(dialogProjectOtmane.getPasswordLogin(), password);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String SingIn) {
        dialogProjectOtmane.clickMethod(dialogProjectOtmane.getSignInButton());
    }

    @Then("Success  My account")
    public void successMyAccount() {
        dialogProjectOtmane.waitUntilVisible(dialogProjectOtmane.getMYACCOUNT());
        Assert.assertTrue(dialogProjectOtmane.getMYACCOUNT().isDisplayed());
    }
}