package PagesKK2;


import UtilitiesKK2.DriverClassKK2;
import UtilitiesKK2.MyMethodsKK2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog extends MyMethodsKK2 {
    public Dialog() {
        PageFactory.initElements(DriverClassKK2.getDriver(),this);
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



    @FindBy(xpath= "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement ViewShoppingCardOnHomePage;



    @FindBy(xpath= "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement CheckoutButton;



    @FindBy(xpath= " //*[@id=\"center_column\"]/form/p/button")
    private WebElement ProceedToCheckOutButton;


    @FindBy(xpath= "//*[@id=\"uniform-cgv\"]/span")
    private WebElement CheckBox;

    @FindBy(xpath= " //*[@id=\"form\"]/p/button/span")
    private WebElement ProceedToCheckOutButton1;

    @FindBy(xpath= "//*[@id=\"paypal-standard-btn\"]")
    private WebElement PayWithPayPal;
    @FindBy(xpath= "//*[text()=\"Things don't appear to be working at the moment. Please try again later.\"]")
    private WebElement PayPalMessage;

    @FindBy(xpath= "//*[@id=\"ccBillForm\"]/p/a")
    private WebElement PayWithCreditCard;

    @FindBy(xpath= "/html/body")
    private WebElement CreditCardMessage;

    @FindBy(xpath= "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement PayWithBank;

    @FindBy(xpath= "//*[text()=\"Your order on Xu Clothing is complete.\"]")
    private WebElement BankMessage;

    public WebElement getConfirmOrder() {
        return ConfirmOrder;
    }

    @FindBy(xpath= "//*[@id=\"cart_navigation\"]/button/span")
    private WebElement ConfirmOrder;


    public WebElement getPayWithBank() {
        return PayWithBank;
    }

    public WebElement getBankMessage() {
        return BankMessage;
    }

    public WebElement getCheckBox() {
        return CheckBox;
    }

    public WebElement getProceedToCheckOutButton1() {
        return ProceedToCheckOutButton1;
    }

    public WebElement getPayWithPayPal() {
        return PayWithPayPal;
    }

    public WebElement getPayPalMessage() {
        return PayPalMessage;
    }

    public WebElement getPayWithCreditCard() {
        return PayWithCreditCard;
    }

    public WebElement getCreditCardMessage() {
        return CreditCardMessage;
    }

    public WebElement getProceedToCheckOutButton() {
        return ProceedToCheckOutButton;
    }
    public WebElement getCheckoutButton() {
        return CheckoutButton;
    }

    public WebElement getViewShoppingCardOnHomePage() {
        return ViewShoppingCardOnHomePage;
    }
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
