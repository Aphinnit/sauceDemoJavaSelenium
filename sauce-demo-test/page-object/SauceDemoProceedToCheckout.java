import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoProceedToCheckout{
    private WebDriver driver;

    public SauceDemoProceedToCheckout(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement proceed(String productPrice) {
        return driver.findElement(By.className("shopping_cart_link"));
    }

    public WebElement chekcout(String productPrice) {
        return driver.findElement(By.id("checkout"));
    }

}
