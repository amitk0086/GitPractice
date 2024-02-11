package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ProductPage {

    WebDriver ldriver;
    public ProductPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(className ="//h2[@class='FormalShoesTitle']")
    WebElement formalshoetitle;

    @FindBy(xpath ="//h2[@class='FormalShoesTitle']/../div/i[1]")
    WebElement formalshoetitledropdown;

    @FindBy(className ="//h2[@class='SportsShoesTitle']")
    WebElement Sportsshoetitle;

    @FindBy(xpath ="//h2[@class='SportsShoesTitle']/../div/i[1]")
    WebElement Sportsshoetitledropdown;

    @FindBy(className ="//h2[@class='SneakerShoesTitle']")
    WebElement sneakershoetitle;

    @FindBy(xpath ="//h2[@class='SneakerShoesTitle']/../div/i[1]")
    WebElement sneakershoetitledropdown;

    @FindBy(xpath = "//table[@class='table table-striped thead-dark formalshoetable']/tbody/tr/td[1]")
    List<WebElement> FormalshoeName;


    public void getformalshoetitle()
    {
        String Expectedtext="Formal Shoes";
        String ActualText =formalshoetitle.getText();
        Assert.assertEquals(ActualText,Expectedtext);
    }
    public void clickformalshoetitledropdown() throws InterruptedException {
        formalshoetitledropdown.click();
        Thread.sleep(2000);

    }

    public void getSportsshoetitle()
    {
        String Expectedtext="Sports Shoes";
        String ActualText =Sportsshoetitle.getText();
        Assert.assertEquals(ActualText,Expectedtext);
    }
    public void clickSportsshoetitledropdown()
    {
        Sportsshoetitledropdown.click();
    }

    public void getsneakershoetitle()
    {
        String Expectedtext="Sneakers";
        String ActualText =sneakershoetitle.getText();
        Assert.assertEquals(ActualText,Expectedtext);
    }
    public void clicksneakershoetitledropdown()
    {
        sneakershoetitledropdown.click();
    }

    public void getshoeName(String name)
    {
       for(int i=0;i<FormalshoeName.size();i++)
       {
         String shoename=  FormalshoeName.get(i).getText();
         if(shoename.equals(name))
         {
             Assert.assertTrue(true);
         }
         else
         {
             Assert.assertTrue(false);
         }
       }
    }


}
