package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePage {
    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }
}