package StepDef_CavourTask;

import Page_CavourTask.CavourPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddCartSteps {
    CavourPOM CavourPOM = new CavourPOM();
    private WebDriver DriverClass;
    Actions actions = new Actions(DriverClass);

    @Given("User hover over dress and select summer dress")
    public void userHoverOverDressAndSelectSummerDress() {
      actions.moveToElement(CavourPOM.getDressButton());
      CavourPOM.clickMethod(CavourPOM.getSummerDressButton());


    }

    @Then("User  should be directed to the product page")
    public void userShouldBeDirectedToTheProductPage() {

        Assert.assertTrue(CavourPOM.getDressButton().isDisplayed());

    }

    @And("The user should be able to hover over any product")
    public void theUserShouldBeAbleToHoverOverAnyProduct() {
        actions.moveToElement(CavourPOM.getHoverToItem());
        CavourPOM.waitMethod(5);
Assert.assertTrue(CavourPOM.getAddToCartDisplayed().isDisplayed());


    }

    @And("When the user clicks on the Add to cart button, the product should be added to the cart.")
    public void whenTheUserClicksOnTheAddToCartButtonTheProductShouldBeAddedToTheCart() {

        CavourPOM.clickMethod(CavourPOM.getAddToCartDisplayed());

    }

    @Then("It must be verified that the product has been successfully added to the cart.")
    public void itMustBeVerifiedThatTheProductHasBeenSuccessfullyAddedToTheCart() {

        Assert.assertTrue(CavourPOM.getIconCheckDisplayed().isDisplayed());
    }
}
