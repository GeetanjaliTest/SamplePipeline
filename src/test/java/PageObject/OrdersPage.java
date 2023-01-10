package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
    public WebDriver mdriver;

    public OrdersPage(WebDriver ndriver)
    {
        mdriver=ndriver;
        PageFactory.initElements(mdriver, this);
    }
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    WebElement ordersTab;
    @FindBy(xpath = "//table[contains(@class,'table table-hover')]")
    WebElement ordersTable;
    @FindBy(xpath = "//th[text()='OrderId']")
    WebElement orderIdField;

    @FindBy(xpath = "//th[text()='UserId']")
    WebElement userIdField;

    @FindBy(xpath = "//th[text()='Book Name']")
    WebElement bookNameField;

    @FindBy(xpath = "//th[text()='Price']")
    WebElement priceField;

    @FindBy(xpath = "//th[text()='Quantity']")
    WebElement quantityField;

    @FindBy(xpath = "//th[text()='Total Price']")
    WebElement totalPriceField;

    @FindBy(linkText = "Add to Cart")
    WebElement linkAddtoCart;

    @FindBy(xpath = "//th[text()='Quantity']//following::td[1]")
    WebElement itemAdded;

    @FindBy(xpath = "//a[@href='/cart/delete']")
    WebElement deleteItem;

    @FindBy(xpath = "//p[text()='No Items in the cart']")
    WebElement itemDeleted;

    @FindBy(linkText = "Book Order")
    WebElement linkBookOrder;

    @FindBy(xpath = "//th[text()='Quantity']//following::td[1]")
    WebElement itemMyOrder;

    @FindBy(linkText = "Place order")
    WebElement linkPlaceOrder;
    public void clickOrdersTab() {
        ordersTab.click();
    }
    public void checkOrdersTable() {
        ordersTable.isDisplayed();
    }
    public void checkOrdersPage() {
        orderIdField.isDisplayed();
        userIdField.isDisplayed();
        bookNameField.isDisplayed();
        priceField.isDisplayed();
        quantityField.isDisplayed();
    }

    public void checkCartPage() {
        bookNameField.isDisplayed();
        priceField.isDisplayed();
        quantityField.isDisplayed();
    }

    public void checkMyOrderPage() {
        bookNameField.isDisplayed();
        priceField.isDisplayed();
        quantityField.isDisplayed();
        totalPriceField.isDisplayed();
    }

    public void clickAddtoCart() {
        linkAddtoCart.click();
    }

    public void checkItemAddedtoCart() {
        itemAdded.isDisplayed();
    }

    public void deleteItemFromCart() {
        deleteItem.click();
    }

    public void checkItemDeleted() {
        itemDeleted.isDisplayed();
    }

    public void clicklinkBookOrder() {
        linkBookOrder.click();
    }

    public void checkItemAddedtoMyOrder() {
        itemMyOrder.isDisplayed();
    }

    public void clicklinkPlaceOrderr() {
        linkPlaceOrder.click();
    }
}
