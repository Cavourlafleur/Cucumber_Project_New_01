package StepDefinitions;

import Pages.Dialog;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class _task06 extends DriverClass {

    Dialog dialog = new Dialog();
    private static WebDriver driver;
    Actions actions = new Actions(DriverClass.getDriver());

    @Given("Navigate to  Web Site")
    public void navigateToWebSite() {
        DriverClass.getDriver().get("https://cleverppc.com/prestashop4/.");
    }

    @And("Enter Sing in")
    public void enterSingIn() {
        dialog.clickMethod(dialog.getSignIn());
    }

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
    @Then("User Should Verify That There Are a Total Of Three Items In The Shopping Cart")
    public void UserShouldVerifyThatThereAreaTotalOfThreeItemsInTheShoppingCart() {
        dialog.assertSuccessMessage(dialog.getSuccessMessage());
    }
}
