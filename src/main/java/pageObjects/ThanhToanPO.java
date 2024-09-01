package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ThanhToanPageUI;

public class ThanhToanPO extends BasePage {
    WebDriver driver;

    public ThanhToanPO(WebDriver driver) {
        this.driver = driver;
    }

}