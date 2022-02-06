package PageObjects;

import BaseTests.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage  extends BaseClass {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//img[@class='logo-logo--5b465']")
    public WebElement brandLogo;

    @FindBy(linkText = "Sign in")
    public WebElement signInLink;

    @FindBy(id="mobileSearch")
    public WebElement searchTextBox;

    @FindBy(xpath="//button[@class='button.module-c-button--fe2f1']")
    public WebElement searchButton;

    @FindBy(xpath="//img[@class='logo-logo--5b465']")
    public WebElement wishListLink;

    public void verifyLogo()
    {
        Assert.assertTrue(brandLogo.isDisplayed());
    }
    public void enterSearchText(String searchTerm)
    {
        searchTextBox.sendKeys(searchTerm);
    }
    public void clickSignInLink()
    {
        signInLink.click();
    }
    public void clickSeacrhButton()
    {
        searchButton.click();
    }
    public void clickWishListLink()
    {
        wishListLink.click();
    }

}
