package pageUIs;

public class ThanhToanOnlinePageUI {
    public static final String THANH_TOAN_ONLINE_TEXT = "//div[@class='content']/h3";
    public static final String DYNAMIC_METHOD_PAYMENT_BY_NAME = "//div[@class='content']//ul[@class='pay-method1']//h4[text()='%s']";
    public static final String CHON_MENH_GIA_OPTION = "//div[@class='payment-online__form']//label[contains(text(),'Chọn mệnh giá')]";
    public static final String THANH_TOAN_BUTTON = "//div[@class='payment-online__btn']/button";
    public static final String SDT_NHAN_TEXTBOX = "//label[contains(text(),'SĐT nhận thẻ cào*')]/following-sibling::div//input";
    public static final String MESSAGE_TEXT_AT_CHON_MENH_GIA_FIELD = "//label[contains(text(),'Chọn mệnh giá')]/parent::div/following-sibling::p";
    public static final String MESSAGE_TEXT_AT_SDT_FIELD = "//label[contains(text(),'SĐT')]/following-sibling::div/div/p[@class='error-message']";

    public static final String DYNAMIC_CHON_MENH_GIA_BY_VALUE = "//ul[@class='face-value-money']//li/span[text()='%s']";
    public static final String MESSAGECHUACHONPTTT = "//div[@class='modal-data']//p/following-sibling::p";
    public static final String QUAYLAIBUTTON = "//div[@class='modal-data']//a[contains(text(),'Quay lại')]";
    public static final String CHONPTTT = "//div[@class='select-method__top-custom']//h5";

    public static final String CHON_PTTT_TEXT = "//div[@class='payment-online']//h3[text()='Chọn Phương thức thanh toán']";
    public static final String CHON_PTTT_BY_NAME = "//div[@class='method-payment']//h5[text()='%s']";
    public static final String DONG_Y_BUTTON = "//div[@class='order-payment__btn']/a[contains(text(),'Đồng ý')]";

    public static final String PTTT_IS_SELECTED = "//li[@class='select-method__item-custom']";


}
