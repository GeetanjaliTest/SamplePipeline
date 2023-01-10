package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "email")
    WebElement emailid;
    @FindBy(id = "password")
    WebElement passwordid;
    @FindBy(id = "submitButton")
    WebElement submitbtn;
    @FindBy(id = "logout")
    WebElement logoutbtn;
    public void checkLoginPage() {
        emailid.isDisplayed();
        passwordid.isDisplayed();
        submitbtn.isDisplayed();
    }
    public void setEmailid(String email) {
        emailid.clear();
        emailid.sendKeys(email);
    }
    public void setPassword(String password) {
        passwordid.clear();
        passwordid.sendKeys(password);
    }
    public void SubmitLoginBtn() {
        submitbtn.click();
    }
    public void Logoutmethod() {

        logoutbtn.click();
    }
}
