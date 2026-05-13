package testcases;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Homepage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage lp = new LoginPage(driver);

        lp.loginToApplication("standard_user", "secret_sauce");
        Homepage hp = new Homepage(driver);

        String actualText = hp.getHomePageText();

        Assert.assertEquals(actualText, "Products");

        System.out.println("Login Successful");
    }
}