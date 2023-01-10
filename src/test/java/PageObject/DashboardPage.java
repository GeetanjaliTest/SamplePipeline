package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public WebDriver ldriver;
    public DashboardPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
    }
    @FindBy(xpath = "//th[text()='Image']")
    WebElement imageField;
    @FindBy(xpath = "//th[text()='Book Name']")
    WebElement bookNameField;
    @FindBy(xpath = "//th[text()='Price']")
    WebElement priceField;
    @FindBy(xpath = "//th[text()='Quantity']")
    WebElement quantityField;
    @FindBy(id = "homeButton")
    WebElement homeTab;
    @FindBy(id = "cartButton")
    WebElement cartTab;
    @FindBy(id = "orderButton")
    WebElement orderTab;
    @FindBy(xpath = "//div[contains(@class,'text-center pt-5')]//h1[1]")
    WebElement welcomeHeader;
    @FindBy(xpath = "//h1[text()=' Home ']")
    WebElement homeHeader;

    @FindBy(xpath = "//app-product-list-item[1]")
    WebElement imageLink;

    @FindBy(xpath = "//app-product-list-item[2]")
    WebElement imageNewLink;
    public void checkDashboardPage() {
        imageField.isDisplayed();
        bookNameField.isDisplayed();
        priceField.isDisplayed();
        quantityField.isDisplayed();
    }
    public void checkCustDashboardPage() {
        homeTab.isDisplayed();
        cartTab.isDisplayed();
        orderTab.isDisplayed();
    }
    public void checkWelcomePageDisplayed() {
        welcomeHeader.isDisplayed();
        homeHeader.isDisplayed();
    }
    public void clickCartTab() {
        cartTab.click();
    }
    public void clickMyOrderTab() {
        orderTab.click();
    }

    public void clickImage() {
        imageLink.click();
    }

    public void clickNewImage() {
        imageNewLink.click();
    }
}
