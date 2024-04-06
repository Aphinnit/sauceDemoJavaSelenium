import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functional {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "user/aphinit/driver/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Create instance of keyword class
        commonkeyword keywords = new commonkeyword(driver);

        // Navigate to SauceDemo login page
        driver.get("https://www.saucedemo.com/");

        // Test Case 1: Login with valid credentials
        testValidLogin(keywords);

        // Test Case 2: Attempt login with invalid credentials
        testInvalidLogin(keywords);

        // Close the browser
        driver.quit();
    }

    private static void testValidLogin(SauceDemoKeywords keywords) {
        // Login with valid credentials
        keywords.login("standard_user", "secret_sauce");

        // Sort the products by price from high to low
        keywords.sortProductsByPrice();

        // Add products with price $15.99 to cart
        keywords.addToCart("$15.99", 2);

        // Proceed to checkout
        keywords.proceedToCheckout();

        // Complete checkout
        keywords.completeCheckout("Testing First Name", "Testing Last Name ", "Testing Postal Code");

        // Log the checkout summary
        System.out.println("Checkout Summary: " + keywords.getCheckoutSummary());
    }

    private static void testInvalidLogin(SauceDemoKeywords keywords) {
        // Attempt login with invalid credentials
        System.out.println("Error message for locked_out_user: " + keywords.attemptLoginWithInvalidCredentials("locked_out_user", "secret_sauce"));
    }
}
