package TestRunner;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import com.bassMethods.Bass_Class;

import PageObjectManager.PageObjManager;

public class Runner_Clas extends Bass_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getBrowser("chrome");
		wait("implicit");
		get("http://automationpractice.com/index.php");
		PageObjManager pom = new PageObjManager(driver);
		Thread.sleep(3000);
		click(pom.getCreateAcpage().getSigninbtn());

		sendkey(pom.getCreateAcpage().getMail(), "vijaysangeedha522003@gmail.com");
		click(pom.getCreateAcpage().getCreateAcbtn());
		click(pom.getCreateAcpage().getMrBtn());
		sendkey(pom.getCreateAcpage().getFirstname(), "vandu");
		sendkey(pom.getCreateAcpage().getLastname(), "murugan");
		sendkey(pom.getCreateAcpage().getPassword(), "6381269075");
		select(pom.getCreateAcpage().getDay(), "value", "30");
		select(pom.getCreateAcpage().getMonth(), "value", "4");
		select(pom.getCreateAcpage().getYear(), "value", "1994");
		click(pom.getCreateAcpage().getCheckbox());
		sendkey(pom.getCreateAcpage().getCompanyname(), "Greens Technoligies");
		sendkey(pom.getCreateAcpage().getAddress(), "Karnan street,Mugappair West,mogappair post,Greens Tech,");
		sendkey(pom.getCreateAcpage().getFlatname(), "Galaxy Apartment,First Floor,Door No : F1");
		sendkey(pom.getCreateAcpage().getCityname(), "chennai");
		select(pom.getCreateAcpage().getState(), "text", "New York");
		sendkey(pom.getCreateAcpage().getCode(), "10001");
		select(pom.getCreateAcpage().getCountryname(), "text", "United States");
		sendkey(pom.getCreateAcpage().getOtherbox(),
				"Na Oru Thadava Mudivu Pannita En Pecha Nane Keka Maten Enake Siripu VAruthu Enna Seyya");
		sendkey(pom.getCreateAcpage().getHomephn(), "9786262326");
		sendkey(pom.getCreateAcpage().getAssignaddress(), "Karnan street");
		click(pom.getCreateAcpage().getRegisterbtn());
		screenshot("screenshot001.png");

		// women page
		Actions(pom.getWomenPage().getWomen(), "move");
		click(pom.getWomenPage().getCasual());
		scroll("(0,700)", "");

		Actions(pom.getWomenPage().getPrinted(), "move");
		Actions(pom.getWomenPage().getQucikview(), "move");
		click(pom.getWomenPage().getQucikview());
		frame(pom.getWomenPage().getFrame());

		for (int i = 0; i < 8; i++) {
			click(pom.getWomenPage().getPlusBtn());
		}

		select(pom.getWomenPage().getSize(), "value", "3");
		click(pom.getWomenPage().getAddtocart());
		exitFrame();

		screenshot("scrrenshot002.png");
		// Thread.sleep(3000);
		click(pom.getCheckOutPage().getCheckoutbtn());
		// scrollIntoView(pom.getSummaryPage().getProceedtochkout());
		JavaScriptclick(pom.getSummaryPage().getProceedtochkout());

		scrollIntoView(pom.getAddressPage().getProcessAddress());
		JavaScriptclick(pom.getAddressPage().getProcessAddress());

		scrollIntoView(pom.getShippage().getCheckbox());
		click(pom.getShippage().getCheckbox());
		JavaScriptclick(pom.getShippage().getCheckoutbutton());

		scrollIntoView(pom.getPaymentPage().getTotal());
		click(pom.getPaymentPage().getBank());
		JavaScriptclick(pom.getConformOrder().getConfrmOrderbtn());

		scroll("(0,300)", "");

		screenshot("screenshot003.png");

	}
}
