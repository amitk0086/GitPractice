package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import pages.ProductPage;

public class ProductPageTest extends BaseClass {
    ProductPage productPage;
    @Test
    public void testformalshoepage() throws InterruptedException {
        productPage = new ProductPage(driver);
        Thread.sleep(3000);
        productPage.clickformalshoetitledropdown();
        productPage.getshoeName("Classic Cheltenham");
    }
}
