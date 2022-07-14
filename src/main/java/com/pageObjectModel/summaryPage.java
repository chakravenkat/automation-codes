package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summaryPage {
	public static WebDriver driver;

	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement Proceedtochkout;

	public summaryPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtochkout() {
		return Proceedtochkout;
	}

}
