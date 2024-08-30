package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
	public static HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}

	public static ThanhToanOnlinePO getThanhToanOnlinePage(WebDriver driver) {
		return new ThanhToanOnlinePO(driver);
	}
	
}

