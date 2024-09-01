package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ThanhToanOnlinePageUI;
import pageUIs.ThanhToanPageUI;

public class ThanhToanOnlinePO extends BasePage {
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
        sleepInSecond(3);
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

    public void chonMenhGiaByValue(WebDriver driver, String value) {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.DYNAMIC_CHON_MENH_GIA_BY_VALUE, value);
        clickToElement(driver, ThanhToanOnlinePageUI.DYNAMIC_CHON_MENH_GIA_BY_VALUE, value);
    }

    public String messageChuaChonPPTTIsDisplayed() {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.MESSAGECHUACHONPTTT);
        return getElementText(driver, ThanhToanOnlinePageUI.MESSAGECHUACHONPTTT);
    }

    public void clickToQuayLaiButton() {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.QUAYLAIBUTTON);
        clickToElement(driver, ThanhToanOnlinePageUI.QUAYLAIBUTTON);
    }

    public void clickToChonPTTT() {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.CHONPTTT);
        clickToElement(driver, ThanhToanOnlinePageUI.CHONPTTT);
    }

    public boolean textChonPTTTIsDisplay() {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.CHON_PTTT_TEXT);
        return isElementDisplayed(driver, ThanhToanOnlinePageUI.CHON_PTTT_TEXT);
    }

    public void chonPTTTByName(String ptttName) {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.CHON_PTTT_BY_NAME, ptttName);
        clickToElement(driver, ThanhToanOnlinePageUI.CHON_PTTT_BY_NAME, ptttName);
    }

    public void clickToDongYButton() {
        waitForElementClickable(driver, ThanhToanOnlinePageUI.DONG_Y_BUTTON);
        clickToElement(driver, ThanhToanOnlinePageUI.DONG_Y_BUTTON);
    }

    public boolean ptttIsSelected() {
        waitForElementVisible(driver, ThanhToanOnlinePageUI.PTTT_IS_SELECTED);
        return isElementDisplayed(driver, ThanhToanOnlinePageUI.PTTT_IS_SELECTED);
    }
}