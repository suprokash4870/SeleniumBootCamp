package RegressionSuite;

import Regression.CignaHomePage;
import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaTestHomePage extends SeleniumAPI {
    CignaHomePage homePage;
    String url = "https://www.cigna.com/";

    @BeforeMethod

    public void init() {
        homePage = PageFactory.initElements(driver, CignaHomePage.class);
        driver.get(url);
    }
    @Test
    public void CheckNavigation(){
        homePage.ClickOnNavigationTab();
    }
    @Test
    public void SearchForProduct(){
        homePage.SearchProduct();
    }

}
