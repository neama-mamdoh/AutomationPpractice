package Base;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import Pages.Home;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    protected WebDriver driver;
    protected Home home;

    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.get("https://www.automationexercise.com/");
        home = new Home(driver);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
