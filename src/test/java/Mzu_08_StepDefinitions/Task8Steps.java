package Mzu_08_StepDefinitions;

import PagesKK2.Dialog;
import UtilitiesKK2.MyMethodsKK2;
import UtilitiesOT.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class Task8Steps extends MyMethodsKK2 {
    Dialog dialog = new Dialog();
    @And("Click on Contact Us Button")
    public void clickOnContactUsButton() {
    dialog.clickMethod(dialog.getContactUs());
    }

    @And("User must be able to fill the required fields and Send their message")
    public void userMustBeAbleToFillTheRequiredFieldsAndSendTheirMessage() {
        dialog.clickMethod(dialog.getSubjectHeading());
        dialog.clickMethod(dialog.getCustomerService());

        dialog.clickMethod(dialog.getOrderReferance());
        dialog.clickMethod(dialog.getGetOrderReferance2());

        dialog.clickMethod(dialog.getChooseProduct());
        dialog.clickMethod(dialog.getChooseProduct2());

        dialog.sendKeysMethod(dialog.getMessage(),"Bank Transfer has just been made....");

        dialog.clickMethod(dialog.getSendButton());
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(dialog.getSuccessMess().isDisplayed());
    }

    @Given("Navigate to the web site")
    public void navigateToTheWebSite() {
        DriverClass.getDriver().get("https://cleverppc.com/prestashop4/.");
    }

    @And("Enter Sign in")
    public void enterSignIn() {
        dialog.clickMethod(dialog.getSignIn());
    }

    @And("Enter a valid email addresses and password.")
    public void enterAValidEmailAddressesAndPassword() {
        dialog.sendKeysMethod(dialog.getEmailInput(),"yuyu@gmail.com");
        dialog.sendKeysMethod(dialog.getPasswordInput(),"6521S");
    }

    @And("Click Sign in Button")
    public void clickSignInButton() {
        dialog.clickMethod(dialog.getSignInButton());

    }
}
