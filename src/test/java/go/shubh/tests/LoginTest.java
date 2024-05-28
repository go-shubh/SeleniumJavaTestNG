package go.shubh.tests;

import go.shubh.base.BaseTest;
import go.shubh.pages.ProductsPage;
import go.shubh.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(propReader.getProperty("username"), propReader.getProperty("password"));

        ProductsPage dashboardPage = new ProductsPage(driver);
        Assert.assertTrue(dashboardPage.getPageTitle().contains("Swag Labs") && dashboardPage.getPageHeading().contains("Products"), "Login failed or Products page not loaded");
    }
}
