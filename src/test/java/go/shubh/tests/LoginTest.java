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

        ProductsPage dp = new ProductsPage(driver);
        System.out.println(dp.getPageTitle() + dp.getPageHeading());
        Assert.assertTrue(dp.getPageTitle().contains("Swag Labs") && dp.getPageHeading().contains("Products"), "Login failed or Products page not loaded");
    }
}
