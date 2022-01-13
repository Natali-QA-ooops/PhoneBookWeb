package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration extends TestBase{

    @Test
    public void registrationSuccess(){
        int index=(int)(System.currentTimeMillis()/1000)%3600;

        //click login
        click(By.cssSelector("[href='/login']"));

        //fill email
        type(By.xpath("//input[1]"), "honey"+index+"@mail.com");

        //fill pass
       type(By.xpath("//input[2]"), "Qq123660$");

        //click button registration
        click(By.xpath("//button[2]"));
    }
}
