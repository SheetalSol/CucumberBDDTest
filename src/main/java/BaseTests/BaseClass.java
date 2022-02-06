package BaseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    public void openHomePage()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
