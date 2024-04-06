import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoAddToCartPage {
    private WebDriver driver;

    public SauceDemoAddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addtocart(String productPrice) {
        return driver.findElement(By.xpath("//div[text()='" + productPrice + "']/ancestor::div[@class='inventory_item']//button"));
    }

}
