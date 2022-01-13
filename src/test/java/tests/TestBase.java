package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver wd;
    @BeforeMethod
    public void preCond(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

    }
    /*
    public void type(By locator, String text){
    if(text!=null && !text.isEmpty()){
    WebElement element = wd.findElement(locator);
    element.click();
    element.clear();
    element.sendKeys(text);
     }
     */

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
    @AfterMethod
    public void postCond(){
        //wd.close();
        //wd.quit();
    }
}
