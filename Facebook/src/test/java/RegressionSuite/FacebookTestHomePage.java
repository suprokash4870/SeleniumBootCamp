package RegressionSuite;

import Regression.FacebookHomePage;
import base.SeleniumAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTestHomePage extends SeleniumAPI {

    FacebookHomePage homePage;
    String url = "https://www.facebook.com/";

    @BeforeMethod

    public void init() {
        homePage = PageFactory.initElements(driver, FacebookHomePage.class);
        driver.get(url);
    }

    @Test
    public void LogInVerification(){
        homePage.SetLogIn();
    }

   // @Test
    public void SearchBoxValidation(){
        homePage.SearchBoxVerification();
    }
    //@Test
    public void SearchPersonByName(){
       homePage.SearchByPerson();
    }
    //@Test
    public void CommentToAFriend(){
        homePage.CommentOnAPost();
    }
    //@Test
    public void SendFriendRequest(){
        homePage.SendFriendRequest();
    }
    //@Test
    public void AcceptFriendRequest(){
        homePage.AcceptFriendRequest();
    }
   // @Test
    public void Click_onLikeAPost(){
        homePage.LikAPost();
    }
}
