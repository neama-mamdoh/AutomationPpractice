package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccInfo {
    private WebDriver driver;
    public AccInfo(WebDriver driver) {this.driver = driver;}
    private By title1=By.id("uniform-id_gender1");
    private By title2=By.id("uniform-id_gender2");
    private By name=By.id("name");
    private By email=By.id("email");
    private By password=By.id("password");
    private By Days = By.id("days");
    private By Months = By.id("months");
    private By Years = By.id("years");
    private By checkbox1=By.id("newsletter");
    private By checkbox2=By.id("optin");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By Company = By.id("company");
    private By Address = By.id("address1");
    private By Address2 = By.id("address2");
    private By Country = By.id("country");
    private By State = By.id("state");
    private By City = By.id("city");
    private By Zipcode = By.id("zipcode");
    private By Mobilenumber = By.id("mobile_number");
    private By createAccbutton = By.cssSelector("button[data-qa=create-account]");

    public AccCrreatedPage clickCreateAcc(){
        driver.findElement(createAccbutton).click();
        return new AccCrreatedPage(driver);
    }


    public AccCrreatedPage createAcc(String pass,String day,String month, String year,
                                 String firstname,String lastname,String company,
                                 String address,String address2,String country,
                                 String state,String city,String zipcode,String mobilnum){
        //title
        Boolean selectState1=driver.findElement(title1).isSelected();
        if(selectState1==false)
        {
            driver.findElement(title1).click();
        }
        Boolean selectState2=driver.findElement(title2).isSelected();
        if(selectState2==false)
        {
            driver.findElement(title2).click();
        }
        //password
        driver.findElement(password).sendKeys(pass);
        //day
        new Select(driver.findElement(Days)).selectByVisibleText(day);
        //month
        new Select(driver.findElement(Months)).selectByVisibleText(month);
        //year
        new Select(driver.findElement(Years)).selectByVisibleText(year);
        //chockboxes
        driver.findElement(checkbox1).click();
        driver.findElement(checkbox2).click();
        //frstname
        driver.findElement(firstName).sendKeys(firstname);
        //lastname
        driver.findElement(lastName).sendKeys(lastname);
        //company
        driver.findElement(Company).sendKeys(company);
        //address
        driver.findElement(Address).sendKeys(address);
        //address2
        driver.findElement(Address2).sendKeys(address2);
        //country
        new Select(driver.findElement(Country)).selectByVisibleText(country);
        //state
        driver.findElement(State).sendKeys(state);
        //city
        driver.findElement(City).sendKeys(city);
        //zipcode
        driver.findElement(Zipcode).sendKeys(zipcode);
        //mobile
        driver.findElement(Mobilenumber).sendKeys(mobilnum);
        return clickCreateAcc();
    }


}
