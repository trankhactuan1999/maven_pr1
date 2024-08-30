package pageUIs;

public class BasePaseUI{
    public static final String ClOSE_BUTTON_ON_BANNER = "//span[@class='ins-close-button']";
    public static final String LOGIN_BUTTON = "//li[@class='active']/span";
    public static final String LOGIN_TEXT_POPUP = "//h3[text()='Đăng nhập']";
    public static final String FIELD_TEXTBOX_BY_NAME = "//input[@type='%s']";
    public static final String MESSAGE_TEXT = "//p[@class='error-message' and text()='%s']";
    public static final String MESSAGE_INCORRECT_PASSWORD_TEXT = "//p[@class='modal-data__des']";

    public static final String LOGIN_BUTTON_ON_POPUP = "//button[@type='submit']";
    public static final String BACK_BUTTON = "//div[@class='modal-data']//a";

    public static final String HELLO_TEXT_MESSAGE = "//div[@class='hello']/span//span";

    public static final String DYNAMIC_MENU_BY_NAME = "//a[text()='%s']";
    public static final String DYNAMIC_SUBMENU_BY_NAME = "//a[text()='My Viettel']/following-sibling::ul//li//a[text()='%s']";



}
