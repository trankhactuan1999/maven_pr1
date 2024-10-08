package main.vt;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePO;
import pageObjects.PageGenerator;
import pageObjects.ThanhToanOnlinePO;
import pageObjects.ThanhToanPO;
import pageUIs.BasePaseUI;

@lombok.extern.slf4j.Slf4j
public class Mua_The_Cao extends BaseTest {
    String menhGiaThe, ptttName;

    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        menhGiaThe = "10.000";
        ptttName = "Cổng thanh toán Viettel";

        log.info("Pre-Condition: Step 01: Open Browser: " + browserName + ", URL: " + appUrl);
        driver = getBrowserDriver(browserName, appUrl);

        homePage = PageGenerator.getHomePage(driver);
        homePage.clickIfElemenIsPresent(driver, BasePaseUI.ClOSE_BUTTON_ON_BANNER, 5);
    }
    @Test
    public void Pay_01_Open_Mua_The_Cao_Screen() {
        log.info("Step 02: Point to 'My Viettel' tab on header");
        homePage.pointToHeaderByName(driver,"My Viettel");
        log.info("Step 03: Verify 'Thanh toán Online' option is displayed");
        verifyTrue(homePage.submenuDisplayedByName(driver,"Thanh toán Online"));
        log.info("Step 04: Click to 'Thanh toán Online'");
        thanhToanOnlinePO = homePage.clickToSubmenuByName(driver,"Thanh toán Online");

        log.info("Step 05: Verify Thanh toán Online screen is displayed");
        verifyTrue(thanhToanOnlinePO.thanhToanOnlineIsDisplayed());

        log.info("Step 06: Click on 'Mua thẻ cào'");
        thanhToanOnlinePO.clickToTabByName(driver,"Mua thẻ cào");
        log.info("Step 07: Verify 'Mua thẻ cào' screen is displayed");
        verifyTrue(thanhToanOnlinePO.optionChonMenhGiaIsDisplayed());
    }

    @Test
    public void Pay_02_Verify_Validate_Required_Fields() {
        log.info("Step 08: Click on 'Thanh toán' button");
        thanhToanOnlinePO.clickToThanhToanButton();
        log.info("Step 09: Verify validate message is displayed in 'Chọn mệnh giá' field");
        verifyEquals(thanhToanOnlinePO.messageIsDisplayedAtChonMenhGia(driver),"Vui lòng chọn mệnh giá thẻ cào.");
        log.info("Step 10: Verify validate message is displayed in 'SĐT nhận thẻ cào*' field ");
        verifyEquals(thanhToanOnlinePO.messageIsDisplayedAtSDTField(driver),"Quý khách vui lòng nhập số điện thoại");
        log.info("Step 11: Enter invalid number in 'SĐT nhận thẻ cào*' field");
        thanhToanOnlinePO.enterSDTNhanTheCaoTextbox(driver,"12");
        log.info("Step 12: Click on 'Thanh toán' button");
        thanhToanOnlinePO.clickToThanhToanButton();
        log.info("Step 13: Verify validate message is displayed");
        verifyEquals(thanhToanOnlinePO.messageIsDisplayedAtSDTField(driver),"Số điện thoại không hợp lệ. Quý khách vui lòng thử lại.");

    }

    @Test
    public void Pay_03_Recharge_with_Viettel_Pay_payment_method() {
        log.info("Step 14: Chọn mệnh giá");
        thanhToanOnlinePO.chonMenhGiaByValue(driver, menhGiaThe);
        log.info("Step 15: Enter SĐT nhận thẻ cào");
        thanhToanOnlinePO.enterSDTNhanTheCaoTextbox(driver, "0342992917");
        log.info("Step 16: Click on 'Thanh toán' button");
        thanhToanOnlinePO.clickToThanhToanButton();
        log.info("Step 17: Verify validate message is displayed");
        verifyEquals(thanhToanOnlinePO.messageChuaChonPPTTIsDisplayed(),"Quý khách chưa chọn phương thức thanh toán!");
        log.info("Step 18: Click on 'Quay lại' button");
        thanhToanOnlinePO.clickToQuayLaiButton();
        log.info("Step 19: Click on 'Chọn phương thức thanh toán'");
        thanhToanOnlinePO.clickToChonPTTT();
        log.info("Step 20: Verify 'Chọn PTTT' page is displayed");
        verifyTrue(thanhToanOnlinePO.textChonPTTTIsDisplay());
        log.info("Step 21: Select pay method 'Viettel Pay'");
        thanhToanOnlinePO.chonPTTTByName(ptttName);
        log.info("Step 22: Click on 'Đồng ý' button");
        thanhToanOnlinePO.clickToDongYButton();
        log.info("Step 23: Verify pay method is selected");
        thanhToanOnlinePO.ptttIsSelected();
        log.info("Step 24: Click on 'Thanh toán' button");
        thanhToanOnlinePO.clickToThanhToanButton();

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        cleanBrowserAndDriver();
    }

    WebDriver driver;
    HomePO homePage;
    ThanhToanOnlinePO thanhToanOnlinePO;
    ThanhToanPO thanhToanPO;
}