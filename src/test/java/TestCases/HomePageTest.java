package TestCases;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass {
    HomePage homePage;
    @Test
    public void verifyhomePage()
    {
        homePage= new HomePage(driver);


    }
}
