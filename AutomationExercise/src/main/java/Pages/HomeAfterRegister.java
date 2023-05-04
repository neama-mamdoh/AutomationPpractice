package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAfterRegister {
    private WebDriver driver;
    public HomeAfterRegister(WebDriver driver) {this.driver = driver;}
    public By logname= By.xpath("//div/div/div/div[2]/div/ul/li[10]/a/b");


    private By DeleteAcc= By.linkText("Delete Account");
    public AccDeletedPage ClickDelete(){
        driver.findElement(DeleteAcc).click();
        return new AccDeletedPage(driver);
    }

}
