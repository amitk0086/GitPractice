package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public void setUp()
    {
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        homePage= new HomePage(driver);
        homePage.clickMenuItem();
        homePage.clickProductLink();

    }



    @AfterClass
    public void testDown()
    {
        driver.quit();
    }
}
