package PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjectModel.AddressPage;
import com.pageObjectModel.CreateAc;
import com.pageObjectModel.PaymentPage;
import com.pageObjectModel.Proceed2CheckOutPage;
import com.pageObjectModel.ShippingPage;
import com.pageObjectModel.SignInPage;
import com.pageObjectModel.WomenPage;
import com.pageObjectModel.conformorderPage;
import com.pageObjectModel.summaryPage;
public class PageObjManager {
	public static WebDriver driver;
	public PageObjManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public SignInPage getSignInPage() {
		SignInPage sp = new SignInPage(driver);
		return sp;
	}
	public CreateAc getCreateAcpage() {
		CreateAc ac = new CreateAc(driver);
		return ac;
	}
	public WomenPage getWomenPage() {
		WomenPage wp = new WomenPage(driver);
		return wp;
	}
	public Proceed2CheckOutPage getCheckOutPage() {
		Proceed2CheckOutPage cp = new Proceed2CheckOutPage(driver);
		return cp;
	}
	public summaryPage getSummaryPage() {
		summaryPage sp = new summaryPage(driver);
		return sp;
	}
	public AddressPage getAddressPage() {
		AddressPage ap = new AddressPage(driver);
		return ap;
	}
	public ShippingPage getShippage() {
		ShippingPage sp = new ShippingPage(driver);
		return sp;
	}
	public PaymentPage getPaymentPage() {
		PaymentPage pp = new PaymentPage(driver);
		return pp;
	}
	public conformorderPage getConformOrder() {
		conformorderPage cp = new conformorderPage(driver);
		return cp;
	}
}
