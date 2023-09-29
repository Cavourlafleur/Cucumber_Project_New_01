package Page_CavourTask;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CavourPOM extends MyMethods {

    public CavourPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
@FindBy(xpath = "//*[@class='login']")
    private WebElement SignInButton;


    @FindBy(id = "email")
    private WebElement enterEmail;;
    @FindBy(id = "passwd")
    private WebElement enterPassword;

    @FindBy(xpath = "//*[@class='icon-lock left']")
    private WebElement signInButtonToWeb;

@FindBy(id = "address1")
private  WebElement insertAddress;
@FindBy(id = "city")
private WebElement insertCity;

@FindBy(id = "id_state")
private  WebElement dropMenuState;


@FindBy(xpath = "//span[text()='Virginia']")
private  WebElement stateSelected;

@FindBy(id = "postcode")
private  WebElement zipCode;


@FindBy(id = "phone")
private  WebElement phoneNumber;

@FindBy(xpath = "//span[contains(text(),'Save')]")
private WebElement saveButton;


    @FindBy(xpath = "//h1[text()='My account']")
    private WebElement AccountHeader;


    @FindBy(xpath = "//a[@href='https://cleverppc.com/prestashop4/index.php?controller=sitemap' and normalize-space()='Sitemap']")
    private WebElement siteMapButton;

    @FindBy(xpath = "(//a[@href=\"https://cleverppc.com/prestashop4/index.php?controller=addresses\"])[2]")
    private  WebElement addressesButton;

    @FindBy(xpath = "(//a[@href='https://cleverppc.com/prestashop4/index.php?controller=address'])[2]")
    private WebElement addAddressButton;
@FindBy(css = "span.title i.icon-check")
private  WebElement IconCheckDisplayed;


    //***************************************************************************************

@FindBy(xpath = "(//span[@itemprop='price'])[1]")
private WebElement HoverToItem;

@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
private WebElement AddToCartDisplayed;



    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    private WebElement DressButton;

    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    private WebElement SummerDressButton;


    @FindBy (xpath = "(//span[text()='Add to cart'])[1]")
    private  WebElement HoverOverButton;


    public WebElement getSignInButton() {
        return SignInButton;
    }

    public WebElement getEnterEmail() {
        return enterEmail;
    }

    public WebElement getEnterPassword() {
        return enterPassword;
    }

    public WebElement getSignInButtonToWeb() {
        return signInButtonToWeb;
    }

    public WebElement getAccountHeader() {
        return AccountHeader;
    }

    public WebElement getSiteMapButton() {
        return siteMapButton;
    }

    public WebElement getAddressesButton() {
        return addressesButton;
    }

    public WebElement getAddAddressButton() {
        return addAddressButton;
    }

    public WebElement getInsertAddress() {
        return insertAddress;
    }

    public WebElement getInsertCity() {
        return insertCity;
    }

    public WebElement getDropMenuState() {
        return dropMenuState;
    }

    public WebElement getStateSelected() {
        return stateSelected;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getDressButton() {
        return DressButton;
    }

    public WebElement getSummerDressButton() {
        return SummerDressButton;
    }

    public WebElement getHoverOverButton() {
        return HoverOverButton;
    }

    public WebElement getHoverToItem() {
        return HoverToItem;
    }

    public WebElement getAddToCartDisplayed() {
        return AddToCartDisplayed;
    }

    public WebElement getIconCheckDisplayed() {
        return IconCheckDisplayed;
    }
}



