package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    // Constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Methods
    public void enterUsername(String user) {

        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {

        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {

        driver.findElement(loginBtn).click();
    }
    // Common reusable method
    public void loginToApplication(String user, String pass) {

        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}