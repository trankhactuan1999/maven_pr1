import commons.BaseTest;
import org.testng.annotations.Test;
import pageObjects.HomePO;
import pageObjects.PageGenerator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import pageUIs.BasePaseUI;

import static pageUIs.BasePaseUI.*;

public class Login_With_Phone_Number extends BaseTest {
    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        log.info("Pre-Condition: Step 01: Open Browser: " + browserName + ", URL: " + appUrl);
        driver = getBrowserDriver(browserName, appUrl);

        homePage = PageGenerator.getHomePage(driver);

    }
    @Test
    public void Login_01_Open_Login_Popup() {
    log.info("Step 02: Click to 'Đăng nhập' button");
    homePage.clickToLoginButton(driver);

    log.info("Step 03: Verify 'Đăng nhập' popup is displayed");
    verifyTrue(homePage.isElementDisplayed(driver, LOGIN_TEXT_POPUP));
    }

    @Test
    public void Login_02_Login_With_Invalid_Phone_Number() {
    log.info("Step 04: Enter any non-numeric character in the 'Phone Number' field");
    homePage.enterTextboxByName(driver,"number", "e");

    log.info("Step 05: Verify message is displayed");
    verifyTrue(homePage.isMessageDisplayedByNameField(driver,"number","Số điện thoại không đúng định dạng"));

    log.info("Step 06: Enter < 9 numbers and > 12 numbers in the 'Phone Number' field");
    homePage.enterTextboxByName(driver,"number", "123456");

    log.info("Step 07: Verify message is displayed");
    verifyTrue(homePage.isMessageDisplayedByNameField(driver, "number","Số điện thoại từ 9 đến 12 kí tự"));
    }

    @Test
    public void Login_03_Login_With_Incorrect_Password() {
    log.info("Step 08: Enter valid phone number");
    homePage.enterTextboxByName(driver,"number","0342992545");

    log.info("Step 09: Click on 'Đăng nhập' button without password");
    homePage.clickToLoginButtonOnPopup(driver);

    log.info("Step 10: Verify message is displayed");
    verifyTrue(homePage.isMessageDisplayedByNameField(driver,"password","Mật khẩu là bắt buộc"));

    log.info("Step 11: Enter invalid password");
    homePage.enterTextboxByName(driver,"password", "123");

    log.info("Step 12: Click on 'Đăng nhập' button");
    homePage.clickToLoginButtonOnPopup(driver);

    log.info("Step 10: Verify message is displayed");
    verifyEquals(homePage.getTextMessageIncorrectPassword(driver),"Tài khoản hoặc mật khẩu không đúng, Xin Quý khách vui lòng thao tác lại.");

    log.info("Step 14: Click on 'Quay lại' button");
    homePage.clickToBackButton(driver);

    homePage.clickIfElementIsPresent(driver, BasePaseUI.ClOSE_BUTTON_ON_BANNER, 10);
    }



    @AfterClass(alwaysRun = true)
    public void afterClass() {
        cleanBrowserAndDriver();
    }

    WebDriver driver;
    HomePO homePage;


}