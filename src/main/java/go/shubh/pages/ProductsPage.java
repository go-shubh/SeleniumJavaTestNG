package go.shubh.pages;

import go.shubh.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BaseClass {

    @FindBy(className = "title") WebElement productsHeading;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageHeading(){
        return productsHeading.getText();
    }
}