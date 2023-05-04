package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }




    public Signup_login clicksignup_login() {
        driver.findElement(By.linkText("Signup / Login")).click();
        return new Signup_login(driver);
    }


}