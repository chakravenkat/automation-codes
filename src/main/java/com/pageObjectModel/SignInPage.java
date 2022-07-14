
package com.pageObjectModel;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement sign;

	public SignInPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSign() {
		return sign;
	}

	@FindBy(id = "email")
	private WebElement emailId;

	@FindBy(name = "passwd")
	private WebElement password;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement SubmitBtn;

	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

}
