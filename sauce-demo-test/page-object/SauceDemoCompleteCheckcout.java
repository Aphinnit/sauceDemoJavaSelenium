import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoCompleteCheckcout{
    private WebDriver driver;

    public SauceDemoCompleteCheckcout(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstname() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement lastname() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement postalcode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement continueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement finishButton() {
        return driver.findElement(By.id("finish"));
    }


}
