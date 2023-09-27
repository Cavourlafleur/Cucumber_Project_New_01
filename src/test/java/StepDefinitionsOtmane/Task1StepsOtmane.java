
package StepDefinitionsOtmane;


import PagesOtmane.DialogProjectOt;
import UtilitiesOT.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Task1StepsOtmane {


    DialogProjectOt dialogProjectOt = new DialogProjectOt();

    @Given("Navigate to web site")
    public void navigateToWebSite() {
        DriverClass.getDriver().get("https://cleverppc.com/prestashop4/.");
    }

    @And("click on sign in")
    public void clickOnSignIn() {
        dialogProjectOt.clickMethod(dialogProjectOt.getSignIn());

    }

    @And("Enter valid Email")
    public void enterValidEmail() {
        dialogProjectOt.clickMethod(dialogProjectOt.getEmailValid());
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getEmailValid(), "Fevegas@gmail.com");
    }

    @And("Click at Create Button")
    public void clickAtCreateButton() {
        dialogProjectOt.clickMethod(dialogProjectOt.getCreateAccountButton());

    }

    @And("Fill the Form")
    public void fillTheForm() {
        dialogProjectOt.clickMethod(dialogProjectOt.getMr());
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getFirstName(), "Sam");
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getLastName(), "Mo");
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getPassword(), "Fesvegas@");
        dialogProjectOt.clickMethod(dialogProjectOt.getSelectDay());
        dialogProjectOt.clickMethod(dialogProjectOt.getSelectMonth());
        dialogProjectOt.clickMethod(dialogProjectOt.getSelectYear());
        dialogProjectOt.waitUntilClickable(dialogProjectOt.getCheckBox());
        dialogProjectOt.clickMethod(dialogProjectOt.getCheckBox());
    }

    @Then("Click at Register Button")
    public void clickAtRegisterButton() {
        dialogProjectOt.clickMethod(dialogProjectOt.getRegister());
    }

    @Then("Success  Your account has been created.")
    public void successYourAccountHasBeenCreated() {
        dialogProjectOt.waitUntilVisible(dialogProjectOt.getSuccessMessage());
        Assert.assertTrue(dialogProjectOt.getSuccessMessage().isDisplayed());
    }



    @And("Click on the Login Button")
    public void clickOnTheLoginButton() {
        dialogProjectOt.clickMethod(dialogProjectOt.getSignInButton());
    }

    @Then("User should login")
    public void userShouldLogin() {
        Assert.assertTrue(dialogProjectOt.getMYACCOUNT().isDisplayed());
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String Email, String password) {
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getEmailAddress(), Email);
        dialogProjectOt.sendKeysMethod(dialogProjectOt.getPasswordLogin(), password);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String SingIn) {
        dialogProjectOt.clickMethod(dialogProjectOt.getSignInButton());
    }

    @Then("Success  My account")
    public void successMyAccount() {
        dialogProjectOt.waitUntilVisible(dialogProjectOt.getMYACCOUNT());
        Assert.assertTrue(dialogProjectOt.getMYACCOUNT().isDisplayed());
    }
}