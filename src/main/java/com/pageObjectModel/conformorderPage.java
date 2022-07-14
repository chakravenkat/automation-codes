package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class conformorderPage {
	public static WebDriver driver;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confrmOrderbtn;

	public conformorderPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfrmOrderbtn() {
		return confrmOrderbtn;
	}

}
