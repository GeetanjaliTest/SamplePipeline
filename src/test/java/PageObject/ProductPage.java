package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public WebDriver pdriver;

    public ProductPage(WebDriver sdriver) {
        pdriver = sdriver;
        PageFactory.initElements(pdriver, this);
    }

    @FindBy(xpath = "//h2[@class='pt-3']")
    WebElement prodName;

    @FindBy(xpath = "//h4[@class='pt-2']")
    WebElement prodPrice;

    @FindBy(xpath = "//h5[@class='pt-2']")
    WebElement prodDesc;

    @FindBy(xpath = "//label[@for='quant']")
    WebElement prodQuantity;

    @FindBy(xpath = "//th[text()='Quantity']//following::td[5]")
    WebElement editButton;

    @FindBy(xpath = "//input[@placeholder='Enter Quantity']")
    WebElement updateQuantity;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement nextEdit;

    @FindBy(xpath = "//th[text()='Quantity']//following::td[6]")
    WebElement deleteButton;

    public void checkProductPage() {
        prodName.isDisplayed();
        prodPrice.isDisplayed();
        prodDesc.isDisplayed();
        prodQuantity.isDisplayed();
    }

    public void clickEditButton() {
        editButton.click();
    }

    public void updateQuantityValue() {
        updateQuantity.sendKeys("67");
    }

    public void clickNextEditButton() {
        nextEdit.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }
}
