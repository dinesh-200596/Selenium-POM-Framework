package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;

    By productsText = By.className("title");

    public Homepage(WebDriver driver) {

        this.driver = driver;
    }
    public String getHomePageText() {

        return driver.findElement(productsText).getText();
    }
}