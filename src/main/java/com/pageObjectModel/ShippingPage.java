package com.pageObjectModel;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	public static WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement checkoutbutton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	public ShippingPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

}
