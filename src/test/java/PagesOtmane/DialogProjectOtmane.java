package PagesOtmane;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogProjectOtmane extends MyMethods {
    public DialogProjectOtmane() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    //    Sing in ://a[@class='login'] ,
//    Create account : input[name='SubmitCreate']
//    ,Email :input[name='email_create'].
//    , Title MS : id :uniform-id_gender1.
//    , FirstName://input[@id='customer_firstname']
//    ,LastName://input[@id='customer_lastname'].
//    password:input[type='password'].
//    Checkbox:input[name='newsletter']
//    ,Register :(//button[@type="submit"])[2]

    @FindBy(xpath = "//a[@class='login']")
    private WebElement SignIn;
    @FindBy(id = "uniform-id_gender1")
    private WebElement Mr;
    @FindBy (xpath = "//input[@id='customer_firstname']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement LastName;
    @FindBy(css = "input[type='password']")
    private WebElement Password;

    @FindBy(xpath = "//select[@id=\"days\"]/option[4]")
    private WebElement SelectDay;

    @FindBy(xpath = "//select[@id=\"months\"]/option[4]")
    private WebElement SelectMonth;

    @FindBy(xpath = "//select[@id=\"years\"]/option[10]")
    private WebElement SelectYear;

    @FindBy(xpath= "//div[@id=\"uniform-newsletter\"]")
    private WebElement CheckBox;

    @FindBy(name = "submitAccount")
    private WebElement Register;

    @FindBy(css = "input[name='email_create']")
    private WebElement EmailValid;
    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    private WebElement CreateAccountButton;

    @FindBy(xpath = "//div[@id=\"center_column\"]/p[1]")
    private WebElement SuccessMessage;


    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement EmailAddress;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement PasswordLogin;

    public WebElement getMYACCOUNT() {
        return MYACCOUNT;
    }

    @FindBy(xpath = "//div[@id=\"center_column\"]/h1")
    private WebElement MYACCOUNT;
    public WebElement getEmailAddress() {
        return EmailAddress;
    }

    public WebElement getPasswordLogin() {
        return PasswordLogin;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]/span")
    private WebElement signInButton;

    public WebElement getSuccessMessage() {
        return SuccessMessage;
    }

    public WebElement getSignIn() {
        return SignIn;
    }

    public WebElement getMr() {
        return Mr;
    }

    public WebElement getFirstName() {
        return FirstName;
    }

    public WebElement getLastName() {
        return LastName;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getSelectDay() {
        return SelectDay;
    }

    public WebElement getSelectMonth() {
        return SelectMonth;
    }

    public WebElement getSelectYear() {
        return SelectYear;
    }

    public WebElement getCheckBox() {
        return CheckBox;
    }

    public WebElement getRegister() {
        return Register;
    }

    public WebElement getEmailValid() {
        return EmailValid;
    }

    public WebElement getCreateAccountButton() {
        return CreateAccountButton;
    }

}
