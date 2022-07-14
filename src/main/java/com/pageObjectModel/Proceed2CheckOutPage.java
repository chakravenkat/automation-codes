package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2CheckOutPage {
	public static WebDriver driver;

	@FindBy(xpath = "//span[normalize-space(text())='Proceed to checkout']")
	private WebElement checkoutbtn;

	public Proceed2CheckOutPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}

}
