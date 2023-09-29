package StepDefinitionsKK2;



import PagesKK2.Dialog;
import UtilitiesKK2.DriverClassKK2;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_CereatUserName {

        Dialog dialog = new Dialog();


    @Given("Navigate to  Web Site")
    public void navigateToWebSite() {
        DriverClassKK2.getDriver().get("https://cleverppc.com/prestashop4/.");
    }

    @And("Enter Sing in")
    public void enterSingIn() {
        dialog.clickMethod(dialog.getSignIn());
    }

    @And("Add  valid email")
    public void addValidEmail() {
        dialog.sendKeysMethod(dialog.getEmailAddress(), "yuyu@gmail.com");
    }

    @When("Click on CreateAnButton")
    public void clickOnCreateAnButton() {
        dialog.clickMethod(dialog.getCreateAnButton());
    }




    @And("Enter valid data")
    public void enterValidData(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);

            dialog.sendKeysMethod(dialog.getFirstName(), dataList.get(0));
            dialog.sendKeysMethod(dialog.getLastName(), dataList.get(1));
            dialog.getEmail().clear();
            dialog.sendKeysMethod(dialog.getEmail(), dataList.get(2));
            dialog.sendKeysMethod(dialog.getPassword(), dataList.get(3));

        }



    @When("Click on save button")
    public void clickOnSaveButton() {
        dialog.clickMethod(dialog.getRegister());
    }

    @Then("User should login successfully")
    public void UserShouldLoginSuccessfully() {
    }



}
