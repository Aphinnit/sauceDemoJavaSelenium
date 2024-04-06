import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoCheckoutSummaryPage {
    private WebDriver driver;

    public SauceDemoCheckoutSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement chekoutSummary() {
        return driver.findElement(By.className("complete-header"));
    }

}
