import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoLoginPage {
    private WebDriver driver;

    public SauceDemoLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInput() {
        return driver.findElement(By.xpath("//input[@id='user-name']"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//input[@id='login-button']"));
    }
}
