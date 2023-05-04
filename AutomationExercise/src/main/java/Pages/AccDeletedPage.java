package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccDeletedPage {
    private WebDriver driver;
    public AccDeletedPage(WebDriver driver) {this.driver = driver;}
    public By continn= By.linkText("Continue");


    public Home ClickContinue(){
        driver.findElement(continn).click();
        return new Home(driver);
    }
}
