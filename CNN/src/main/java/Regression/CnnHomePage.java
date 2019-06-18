package Regression;

import base.SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHomePage extends SeleniumAPI {

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[2]")
    WebElement NavigationTab;
    @FindBy(xpath = "//*[@id=\"search-button\"]")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"search-input-field\"]")
    WebElement SearchNews;
    @FindBy(xpath = "//*[@id=\"submit-button\"]")
    WebElement SubmitButton;

    public void NavigationTab(){
        NavigationTab.click();
    }

    public String getTextByXpath(String locator) {
        NavigationTab.click();
        String st = driver.findElement(By.xpath("//*[@id=\"world-zone-2\"]/div[6]/div[2]/div[5]/ul/li[1]/article/div/div[2]/h3/a/span[1]")).getText();
        return st;
    }
    public void VerifyNews(){
        NavigationTab.click();
        if (NavigationTab.isDisplayed()) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
    public void SearchForNews(){
        SearchButton.click();
        SearchNews.sendKeys("World");
        SubmitButton.click();

        }


}
