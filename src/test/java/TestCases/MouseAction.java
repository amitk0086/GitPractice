package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

    public static void main(String args[])
    {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act= new Actions(driver);
        act.moveToElement(button).perform();
        act.contextClick(button).perform();






    }
}
