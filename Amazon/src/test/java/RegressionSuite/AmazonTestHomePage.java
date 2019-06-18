package RegressionSuite;

import Regression.AmazonHomePage;
import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestHomePage extends SeleniumAPI {

    AmazonHomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeMethod

    public void init() {
        homePage = PageFactory.initElements(driver, AmazonHomePage.class);
        driver.get(url);
    }
   // @Test
    public void SignInButtonValidation(){
        homePage.SignInVerification("suprokashsanyal@yahoo.com","ashok4870");
    }

   // @Test
    public void SearchItem(){
        homePage.SearchBoxVerification();
    }
   // @Test
    public void SelectProduct(){
        homePage.SelectItem();
    }
  //  @Test
    public void AddItemToCart(){
        homePage.AddItemIntoCart();
    }
    //@Test
    public void CheckOutValidation(){
        homePage.CheckOutVerification();
    }
   // @Test
    public void BrowserBackNavigationVerification(){
        homePage.BrowserBackNavigationCheck();
    }
  //  @Test
    public void BrowserForwardNavigationVerification(){
        homePage.BrowserForwardNavigationCheck();
    }
    @Test
    public void SignOutValidation(){
        homePage.SignOutVerification();
    }
}
