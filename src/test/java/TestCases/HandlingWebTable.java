package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        driver.manage().window().maximize();

        int row= driver.findElements(By.xpath("//table[@class='tg']/tbody/tr")).size();
        int colm= driver.findElements(By.xpath("//table[@class='tg']/tbody/tr[2]/td")).size();


        for (int i=2;i<=row;i++)
        {
            for(int j=1;j<=colm;j++)
            {
               String value= driver.findElement(By.xpath("//table[@class='tg']/tbody/tr["+i+"]/td["+j+"]")).getText() ;
               if(value.equals("Mayur Deshmukh"))
               {
                   System.out.println(value);
                   break;
               }
            }

        }

        driver.quit();
    }

}
