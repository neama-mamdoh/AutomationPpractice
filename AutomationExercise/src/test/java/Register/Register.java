package Register;


import Base.BaseTests;
import Pages.Home;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Register extends BaseTests {

@Test
    public void createAccount(){
    var signup_login = home.clicksignup_login();
    var accInfo=signup_login.Signup("Sanjay","sanjay5@gmail.com");
    var accCrreatedPage=accInfo.createAcc("12345","4","April","2000",
            "Sanjay","Ahmed","ITI", "ahmedabad","islamabad",
            "India","india","ahmedabad","20354","01123875682");

    var homeAfterRegister=accCrreatedPage.ClickContinue();
    String loguser=driver.findElement(By.xpath("//div/div/div/div[2]/div/ul/li[10]/a/b")).getText();
    assertEquals(loguser,"Sanjay","result text is incorrect");
    var accDeletedPage=homeAfterRegister.ClickDelete();
    home=accDeletedPage.ClickContinue();


}

}
