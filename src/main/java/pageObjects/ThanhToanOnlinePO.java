package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ThanhToanOnlinePageUI;

public class ThanhToanOnlinePO extends BasePage {
    public Object enterSDTNhanTheCaoTextbox;
    WebDriver driver;

    public ThanhToanOnlinePO(WebDriver driver) {
        this.driver = driver;
    }

    public boolean thanhToanOnlineIsDisplayed() {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.THANH_TOAN_ONLINE_TEXT);
        return isElementDisplayed(driver, ThanhToanOnlinePageUI.THANH_TOAN_ONLINE_TEXT);
    }

    public void clickToTabByName(WebDriver driver, String tabName) {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.DYNAMIC_METHOD_PAYMENT_BY_NAME,tabName);
        clickToElement(driver, ThanhToanOnlinePageUI.DYNAMIC_METHOD_PAYMENT_BY_NAME, tabName);
    }

    public boolean optionChonMenhGiaIsDisplayed() {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.CHON_MENH_GIA_OPTION);
        return isElementDisplayed(driver, ThanhToanOnlinePageUI.CHON_MENH_GIA_OPTION);
    }

    public void clickToThanhToanButton() {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.THANH_TOAN_BUTTON);
        clickToElement(driver, ThanhToanOnlinePageUI.THANH_TOAN_BUTTON);
    }

    public String messageIsDisplayedAtSDTField(WebDriver driver) {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.MESSAGE_TEXT_AT_SDT_FIELD);
        return getElementText(driver, ThanhToanOnlinePageUI.MESSAGE_TEXT_AT_SDT_FIELD);
    }

    public void enterSDTNhanTheCaoTextbox(WebDriver driver, String value) {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.SDT_NHAN_TEXTBOX);
        sendkeyToElement(driver, ThanhToanOnlinePageUI.SDT_NHAN_TEXTBOX, value);
    }

    public String messageIsDisplayedAtChonMenhGia(WebDriver driver) {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.MESSAGE_TEXT_AT_CHON_MENH_GIA_FIELD);
        return getElementText(driver, ThanhToanOnlinePageUI.MESSAGE_TEXT_AT_CHON_MENH_GIA_FIELD);
    }
}