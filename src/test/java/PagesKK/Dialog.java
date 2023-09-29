package PagesKK;


import UtilitiesKK.DriverClassKK;
import UtilitiesKK.MyMethodsKK;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog extends MyMethodsKK {
    public Dialog() {
        PageFactory.initElements(DriverClassKK.getDriver(),this);
    }
    @FindBy(css = "a[title=\"Log in to your customer account\"]")
    private WebElement SignIn;

    @FindBy(css = "input[name=\"email_create\"]")
    private WebElement EmailAddress;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    private WebElement CreateAnButton;

    @FindBy(css = "input[name=\"customer_firstname\"]")
    private WebElement FirstName;

    @FindBy(css = "input[name=\"customer_lastname\"]")
    private WebElement LastName;

    @FindBy(css = "input[data-validate=\"isEmail\"]")
    private WebElement email;

    @FindBy(css = "input[data-validate=\"isPasswd\"]")
    private WebElement Password;
    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    private WebElement Register;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement PasswordInput;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement SignInButton;

    @FindBy(xpath = "(//*[text()=\"Dresses\"])[2]")
    private WebElement DressesButton;


    @FindBy(xpath = "//*[@id=\"product_list\"]/li[1]/div")
    private WebElement ProductOne;

    @FindBy(xpath = "//*[@id=\"product_list\"]/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement AddToCard;


    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    private WebElement ContinueShopping;
    @FindBy(css = "a[title=\"View my shopping cart\"]")
    private WebElement ViewShoppingCard;

    @FindBy(xpath = "//*[@id=\"product_list\"]/li[2]")
    private WebElement ProductTwo;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[2]/div/div[2]/div[2]/a[1]/span")
    private WebElement AddToCardTwo;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[4]")
    private WebElement ProductThree;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[4]/div/div[2]/div[2]/a[1]/span")
    private WebElement AddToCardThree;

    public WebElement getSuccessMessage() {
        return SuccessMessage;
    }

    @FindBy(xpath = "//*[@id=\"summary_products_quantity\"]")
    private WebElement SuccessMessage;



    public WebElement getProductTwo() {
        return ProductTwo;
    }

    public WebElement getAddToCardTwo() {
        return AddToCardTwo;
    }

    public WebElement getProductThree() {
        return ProductThree;
    }

    public WebElement getAddToCardThree() {
        return AddToCardThree;
    }

    public WebElement getViewShoppingCard() {
        return ViewShoppingCard;
    }

    public WebElement getAddToCard() {
        return AddToCard;
    }

    public WebElement getContinueShopping() {
        return ContinueShopping;
    }

    public WebElement getDressesButton() {
        return DressesButton;
    }

    public WebElement getProductOne() {
        return ProductOne;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return PasswordInput;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }

    public WebElement getRegister() {
        return Register;
    }

    public WebElement getFirstName() {
        return FirstName;
    }

    public WebElement getLastName() {
        return LastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getSignIn() {
        return SignIn;
    }

    public WebElement getEmailAddress() {
        return EmailAddress;
    }

    public WebElement getCreateAnButton() {
        return CreateAnButton;
    }


}
