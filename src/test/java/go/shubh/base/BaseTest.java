package go.shubh.base;

import go.shubh.utils.BrowserManager;
import go.shubh.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected PropertyReader propReader;

    @BeforeMethod
    public void setUp() {
        propReader = new PropertyReader("files/application.properties");
        String browser = propReader.getProperty("browser");
        driver = BrowserManager.getDriver(browser);
        driver.manage().window().maximize();
        driver.get(propReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
