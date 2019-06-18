package RegressionSuite;

import Regression.CnnHomePage;
import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnTestHomePage extends SeleniumAPI {
    CnnHomePage homePage;
    String url = "https://www.cnn.com/";

    @BeforeMethod

    public void init() {
        homePage = PageFactory.initElements(driver, CnnHomePage.class);
        driver.get(url);
    }
    //@Test
    public void ClickOnNavigatiTabs(){
        homePage.NavigationTab();
    }

    //@Test
    public void getTextFromPage(){
        homePage.getTextByXpath("Tsunamis expected in Japanese coastal regions after earthquake");
    }
   // @Test
    public void VerifyNewsOnPage(){
        homePage.VerifyNews();
    }
    @Test
    public void SearchNewsOnPage(){
        homePage.SearchForNews();
    }

}
