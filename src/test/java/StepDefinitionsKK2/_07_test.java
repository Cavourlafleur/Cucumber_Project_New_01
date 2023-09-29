package StepDefinitionsKK2;



import PagesKK2.Dialog;
import UtilitiesKK2.DriverClassKK2;
import UtilitiesKK2.MyMethodsKK2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class _07_test extends MyMethodsKK2 {

    Dialog dialog=new Dialog();
    Actions actions = new Actions(DriverClassKK2.getDriver());


    @And("Enter a valid email address and password.")
    public void enterAValidEmailAddressAndPassword() {

        dialog.sendKeysMethod(dialog.getEmailInput(),"yuyu@gmail.com");
        dialog.sendKeysMethod(dialog.getPasswordInput(),"6521S");


    }

    @And("Click on Sign in Button")
    public void clickOnSignInButton() {

        dialog.clickMethod(dialog.getSignInButton());
    }

    @And("Enter Dresses Button")
    public void enterDressesButton() {

        dialog.clickMethod(dialog.getDressesButton());
    }

    @And("Add First Product to Cart")
    public void AddFirstProducttoCart() {

        actions.moveToElement(dialog.getProductOne()).perform();

    }

    @And("Add First to Cart")
    public void addFirstToCart() {

        dialog.clickMethod(dialog.getAddToCard());

    }

    @And("Continue shopping")
    public void continueShopping() {

        dialog.clickMethod(dialog.getContinueShopping());
    }

    @And("Add Second Product to Cart")
    public void addSecondProductToCart() {
        actions.moveToElement(dialog.getProductTwo()).perform();

    }

    @And("Add Second to Cart")
    public void addSecondToCart() {
        dialog.clickMethod(dialog.getAddToCardTwo());
    }

    @And("Add third Product to Cart")
    public void addThirdProductToCart() {
        actions.moveToElement(dialog.getProductThree()).perform();
    }

    @And("Add third to Cart")
    public void addThirdToCart() {
        dialog.clickMethod(dialog.getAddToCardThree());

    }
    @When("Click on Cart Button")
    public void clickOnCartButton() {
        dialog.clickMethod(dialog.getViewShoppingCard());
    }

    @And("Click on Checkout button")
    public void clickOnCheckoutButton() {
        dialog.clickMethod(dialog.getCheckoutButton());
    }

    @And("Choose Delivery Address")
    public void chooseDeliveryAddress() {
        dialog.clickMethod(dialog.getProceedToCheckOutButton());
    }

    @And("Agree to Terms of Service")
    public void agreeToTermsOfService() {
        dialog.clickMethod(dialog.getCheckBox());
        dialog.clickMethod(dialog.getProceedToCheckOutButton1());
    }

    @When("Choose Pay With Paypal")
    public void choosePayWithPaypal() {
        dialog.clickMethod(dialog.getPayWithPayPal());
    }

    @Then("The Message for Paypal Must be verified")
    public void theMessageForPaypalMustBeVerified() {

    }

    @When("Choose Pay By  Credit Card")
    public void ChoosePayByCreditCard () {
        dialog.clickMethod(dialog.getPayWithCreditCard());

    }
    @Then("The Message for Credit Card   Must be verified")
    public void theMessageForCreditCardMustBeVerified() {
        dialog.waitUntilVisible(dialog.getCreditCardMessage());
        Assert.assertTrue(dialog.getCreditCardMessage().getText().contains("Invalid request (1)."));
    }

    @And("Choose Pay By Bank")
    public void choosePayByBank() {
        dialog.clickMethod(dialog.getPayWithBank());

    }


    @When("Confirm Order")
    public void confirmOrder() {
        dialog.clickMethod(dialog.getConfirmOrder());
    }

    @Then("The Message for Bank Must be verified")
    public void theMessageForBankMustBeVerified() {
        dialog.assertSuccessMessage(dialog.getBankMessage());
    }
}
