package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
   WebDriver ldriver;
    public HomePage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement menuitem;

    @FindBy(xpath = "//li[text()='Online Products']")
    WebElement onlineProductlink;

    public void clickMenuItem()
    {
        menuitem.click();

    }

    public void clickProductLink()
    {
        onlineProductlink.click();
    }
}
