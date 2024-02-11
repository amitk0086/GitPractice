package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class HashMapUses {

     static HashMap<String, String> LoginData()
    {
        HashMap<String, String> map= new HashMap<>();
        map.put("x","abc@abc");
        map.put("y","Name@Name");
        map.put("z","Kumar@Kumar");
        return map;
    }


    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");

        String data =LoginData().get("x");
        String arr[] =data.split("@");
        System.out.println(arr[0]);
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(arr[0]);

        //driver.quit();

    }
}
