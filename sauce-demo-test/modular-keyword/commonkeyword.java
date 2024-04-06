import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoKeywords {
    private WebDriver driver;
    private WebDriverWait wait;

    public SauceDemoKeywords(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void login(String username, String password) {
        SauceDemoLoginPage loginPage = new SauceDemoLoginPage(driver);
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getLoginButton().click();
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
    }

    public void sortProductsByPrice() {
        SauceDemoPricePage pricePage = new SauceDemoPricePage(driver);
        pricePage.sortDropdown().click();
        pricePage.selectproduct().click();
    }

    public void addToCart(String price, int quantity) {
        SauceDemoAddToCartPage Cart = new SauceDemoAddToCartPage (driver);
        for (int i = 0; i < quantity; i++) {
            Cart.addtocart(price)click();
        }
    }

    public void proceedToCheckout() {
        SauceDemoProceedToCheckout checkout = new SauceDemoProceedToCheckout (driver);
        checkout.proceed().click();
        checkout.checkout().click();
    }

    public void completeCheckout(String firstName, String lastName, String postalCode) {

        SauceDemoCompleteCheckcout complete = new SauceDemoCompleteCheckcout (driver);

        complete.firstname().sendKeys(firstName);
        complete.lastname().sendKeys(lastName);
        complete.postalcode().sendKeys(postalCode);
        complete.continueButton().click();
        complete.finishButton().click();
       
    }

    public String getCheckoutSummary() {
        SauceDemoCheckoutSummaryPage summary = new SauceDemoCheckoutSummaryPage (driver);
        summary.chekoutSummary().getText();
    }

    public String attemptLoginWithInvalidCredentials(String username, String password) {
        SauceDemoLoginPage loginPage = new SauceDemoLoginPage(driver);
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getLoginButton().click();
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='error']")));
        return error.getText();
    }
}
