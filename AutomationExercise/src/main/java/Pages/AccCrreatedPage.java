package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccCrreatedPage {
    private WebDriver driver;
    public AccCrreatedPage(WebDriver driver) {this.driver = driver;}
    private By contin= By.linkText("Continue");

    public HomeAfterRegister ClickContinue(){
        driver.findElement(contin).click();
        return new HomeAfterRegister(driver);
    }

}
