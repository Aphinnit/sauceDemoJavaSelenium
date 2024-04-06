import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoPricePage {
    private WebDriver driver;

      public SauceDemoPricePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement sortDropdownt() {
        return driver.findElement(By.className("product_sort_container"));
    }

    public WebElement selectproduct() {
        return driver.findElement(By.cssSelector("option[value='hilo']"));
    }

}
