package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//span[text()='Total'])[2]")
	private WebElement total;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;

	public PaymentPage(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		PaymentPage.driver = driver;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getBank() {
		return bank;
	}
	
	
	

}
