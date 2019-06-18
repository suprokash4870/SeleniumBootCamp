package Regression;

import base.SeleniumAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookHomePage extends SeleniumAPI {

    @FindBy(id = "email")
    WebElement UserID;
    @FindBy(name = "pass")
    WebElement Password;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement LogIn;
    @FindBy(xpath ="//*[@id=\"js_15i\"]")
    WebElement SearchName;
    @FindBy(xpath = "//*[@id=\"js_4r\"]/form/button/i")
    WebElement Search_Button;
    @FindBy(xpath = "//*[@id=\"facebook\"]/body")
    WebElement CrossElement;
    @FindBy(xpath = "//*[@id=\"xt_uniq_10\"]/div/div/div[1]/div[1]/div[1]/a")
    WebElement SearchPerson;
    @FindBy(xpath = "//*[@id=\"js_n\"]/form/button/i")
    WebElement Search;
    @FindBy(xpath = "//*[@id=\"u_ps_fetchstream_10_3_6\"]/div/div[3]/div[4]/div[2]/div/div/div/div/div/form/div/div/div[2]")
    WebElement Comment;
    @FindBy(xpath = "//*[@id=\"u_ch_4\"]/button[1]")
    WebElement AddFriend;
    @FindBy(xpath = "//*[@id=\"js_8aq\"]/div")
    WebElement AcceptFriendRequest;
    @FindBy(xpath = "//*[@id=\"u_e7_5\"]/div/button[1]")
    WebElement ConfirmRequest;
    @FindBy(xpath = "//*[@id=\"u_ps_0_0_7\"]/div/div[2]/div/div[2]/div/span[1]/div/div/a")
    WebElement LikeAPost;




    public void SetLogIn(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        sleepFor(3);
        LogIn.click();
    }

    public void SearchBoxVerification(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        sleepFor(2);
        SearchName.sendKeys("nandan mukherjee");
        sleepFor(2);
        Search_Button.click();
    }

    public void SearchByPerson(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        sleepFor(2);
        SearchName.sendKeys("nandan mukherjee");
        sleepFor(2);
        Search_Button.click();
        SearchName.click();
    }

    public void CommentOnAPost(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        sleepFor(2);
        SearchName.sendKeys("nandan mukherjee");
        sleepFor(2);
        Search.click();
        SearchName.click();
        Comment.sendKeys("Congratulations!");
    }
    public void SendFriendRequest(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        sleepFor(2);
        SearchName.sendKeys("Sudipta Sanyal");
        Search.click();
        AddFriend.click();

    }
    public void AcceptFriendRequest(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        sleepFor(2);
        SearchName.sendKeys("Sudipta Sanyal");
        AcceptFriendRequest.click();
        ConfirmRequest.click();
    }
    public void LikAPost(){
        UserID.sendKeys("suprokashsanyal@yahoo.com");
        Password.sendKeys("ashok4870");
        LogIn.click();
        CrossElement.click();
        LikeAPost.click();
    }

}
