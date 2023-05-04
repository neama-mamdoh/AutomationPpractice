package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup_login {
    private WebDriver driver;
    //constructor
    public Signup_login(WebDriver driver) {
        this.driver=driver;
    }
    //intitiate locators
    private By Loginemail=By.cssSelector("input[data-qa=login-email]");
    private By Loginpassword=By.cssSelector("input[data-qa=login-password]");
    private By Loginbutton=By.cssSelector("input[data-qa=login-button]");

    private By Registername=By.cssSelector("input[data-qa=signup-name]");
    private By Registeremail=By.cssSelector("input[data-qa=signup-email]");
    private By Registerbutton=By.xpath("//div/div/div[3]/div/form/button");

    private void enterName(String name){
        driver.findElement(Registername).sendKeys(name);
    }
    private void enterEmail(String email){
        driver.findElement(Registeremail).sendKeys(email);
    }

    public AccInfo clickSignup(){
        driver.findElement(Registerbutton).click();
        return new AccInfo(driver);
    }

    public AccInfo Signup(String name,String email){
        enterName(name);
        enterEmail(email);
        return clickSignup();
    }

}
