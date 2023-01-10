package Stepdefinition;

import PageObject.DashboardPage;
import PageObject.LoginPage;
import PageObject.OrdersPage;
import PageObject.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StefDefinition {
    public WebDriver driver;
    public LoginPage loginPage;
    public DashboardPage dashboardPage;
    public OrdersPage ordersPage;

    public ProductPage productPage;

    @Given("User Launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        ordersPage= new OrdersPage(driver);
        productPage= new ProductPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User Enter email id as {string} and  Password as {string}")
    public void user_enter_email_id_as_and_password_as(String emailid, String passwordid) {
        loginPage.setEmailid(emailid);
        loginPage.setPassword(passwordid);
    }

    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
        loginPage.SubmitLoginBtn();
        Thread.sleep(5);
    }

    @Then("Title should be {string}")
    public void Title_should_be(String title) {
        String actualtitle = driver.getTitle();
        if (title.equals(actualtitle)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User Click on LogOut link")
    public void user_click_on_log_out_link() {
        loginPage.Logoutmethod();
    }

    @Then("Login Form Should be appeared and title Should be {string}")
    public void login_form_should_be_appeared_and_title_should_be(String Logouttitle) {
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(Logouttitle)) {
            Assert.assertTrue(true);
        } else {

            Assert.assertTrue(false);

        }
    }

    @Then("Validate products table present")
    public void validateTablePresent() {
        WebElement webElement = driver.findElement(By.xpath("" +
                "//table[contains(@class,'table table-hover')]"));
        if (webElement.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);

        }
    }

    @Then("User should be able to view Login Page")
    public void userShouldBeAbleToViewLoginPage() {
        loginPage.checkLoginPage();
    }

    @And("Close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }

    @And("User should be able to view Image, Bookname, Price, Qunatity fields")
    public void userShouldBeAbleToViewImageBooknamePriceQunatityFields() {
        dashboardPage.checkDashboardPage();
    }

    @Then("Validate Orders table present")
    public void validateOrdersTablePresent() {
        ordersPage.checkOrdersTable();
    }

    @And("User should be able to view OrderId, UserId, Bookname, Price, Qunatity fields")
    public void userShouldBeAbleToViewOrderIdUserIdBooknamePriceQunatityFields() {
        ordersPage.checkOrdersPage();
    }

    @And("User clicks on Orders tab")
    public void userClicksOnOrdersTab() {
        ordersPage.clickOrdersTab();
    }

    @And("User should be able to view Home, Cart, My Order tabs")
    public void userShouldBeAbleToViewHomeCartMyOrderTabs() {
        dashboardPage.checkCustDashboardPage();
    }

    @And("User should be able to view Welcome Home")
    public void userShouldBeAbleToViewWelcomeHome() {
        dashboardPage.checkWelcomePageDisplayed();
    }

    @And("User click Cart tab")
    public void userClickCartTab() {
        dashboardPage.clickCartTab();
    }

    @And("User should be able to view BookName, Price, Quantity")
    public void userShouldBeAbleToViewBookNamePriceQuantity() {
        ordersPage.checkCartPage();
    }

    @And("User click My Order tab")
    public void userClickMyOrderTab() {
        dashboardPage.clickMyOrderTab();
    }

    @And("User should be able to view BookName, Price, Quantity, Total Price")
    public void userShouldBeAbleToViewBookNamePriceQuantityTotalPrice() {
        ordersPage.checkMyOrderPage();
    }

    @When("User click on Product")
    public void userClickOnProduct() {
        dashboardPage.clickImage();
    }

    @Then("User should be able to view Image, productName, productDescription, Price, Quantity")
    public void userShouldBeAbleToViewImageProductNameProductDescriptionPriceQuantity() {
        productPage.checkProductPage();
    }

    @When("User click on Add to Cart")
    public void userClickOnAddToCart() {
        ordersPage.clickAddtoCart();
    }

    @Then("User should be able to view item added to cart")
    public void userShouldBeAbleToViewItemAddedToCart() {
        ordersPage.checkItemAddedtoCart();
    }

    @When("User click delete icon")
    public void userClickDeleteIcon() {
        ordersPage.deleteItemFromCart();
    }

    @Then("User views message {string}")
    public void userViewsMessage(String str) {
        ordersPage.checkItemDeleted();
    }

    @When("User click on next Product")
    public void userClickOnNextProduct() {
        dashboardPage.clickNewImage();
    }

    @When("User click on Book Order")
    public void userClickOnBookOrder() {
        ordersPage.clicklinkBookOrder();
    }

    @Then("User should be able to view item in My Order")
    public void userShouldBeAbleToViewItemInMyOrder() {
        ordersPage.checkItemAddedtoMyOrder();
    }

    @And("User click on Place Order")
    public void userClickOnPlaceOrder() {
        ordersPage.clicklinkPlaceOrderr();
    }

    @And("User Click on Edit Button")
    public void userClickOnEditButton() {
        productPage.clickEditButton();
    }

    @And("User update value into quantity")
    public void userUpdateValueIntoQuantity() {
        productPage.updateQuantityValue();
    }

    @And("User Click on Next Edit Button")
    public void userClickOnNextEditButton() {
        productPage.clickNextEditButton();
    }

    @And("User validate Update successful")
    public void userValidateUpdateSuccessful() {
        WebElement webElement= driver.findElement(By.xpath("//div[@id='productBody']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]"));

        if(webElement.getText().equals("67")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        }

    @And("User Click on Delete Button")
    public void userClickOnDeleteButton() {
        productPage.clickDeleteButton();
    }
}

