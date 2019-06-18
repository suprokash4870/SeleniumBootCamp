package Regression;

import base.SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends SeleniumAPI {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement SignIn;
    @FindBy(name = "email")
    WebElement UserID;
    @FindBy(name = "password")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement Signin_Button;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement SearchBox;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input" )
    WebElement Search_Button;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement SelectProduct;
    @FindBy(id = "add-to-cart-button")
    WebElement AddToCart;
    @FindBy(id = "siNoCoverage-announce")
    WebElement NoThanks;
    @FindBy(xpath = "//*[@id=\"hlb-ptc-btn-native\"]")
    WebElement ProceedToCheckOut;
    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    WebElement SignOut;

    public void SignInVerification(String uid ,String pass){
        SignIn.click();
        UserID.sendKeys(uid);
        Password.sendKeys(pass);
        sleepFor(3);
        Signin_Button.click();
    }

    public void SearchBoxVerification(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
    }

    public void SelectItem(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
        SelectProduct.click();
    }

    public void AddItemIntoCart(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
        SelectProduct.click();
        AddToCart.click();
        NoThanks.click();
    }
    public void CheckOutVerification(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
        SelectProduct.click();
        AddToCart.click();
        sleepFor(3);
        NoThanks.click();
        ProceedToCheckOut.click();
    }

    public void BrowserBackNavigationCheck(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
        sleepFor(3);
        driver.navigate().back();
    }

    public void BrowserForwardNavigationCheck(){
        SearchBox.sendKeys("TV");
        Search_Button.click();
        sleepFor(3);
        driver.navigate().back();
        sleepFor(3);
        driver.navigate().forward();
    }

    public void SignOutVerification(){
        SignIn.click();
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        sleepFor(3);
        Signin_Button.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"))).build().perform();
        sleepFor(3);
        SignOut.click();


    }

}
