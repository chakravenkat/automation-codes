package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAc {
	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signinbtn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement mail;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement CreateAcbtn;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement mrBtn;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='customer_lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//select[@name='days']")
	private WebElement day;
	
	@FindBy(id = "months")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='years']")
	private WebElement year;
	
	@FindBy(xpath = "//label[@for='optin']")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement companyname;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement address;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement flatname;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement cityname;
	
	@FindBy(xpath = "//select[@name='id_state']")
	private WebElement state;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement code;
	
	@FindBy(xpath = "//select[@name='id_country']")
	private WebElement countryname;
	@FindBy(xpath = "//textarea[@name='other']")
	private WebElement otherbox;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement homephn;
	
	@FindBy(xpath = "//input[@name='phone_mobile']")
	private WebElement mobilephn;
	
	@FindBy(xpath = "//input[@name='alias']")
	private WebElement assignaddress;
	
	@FindBy(xpath = "//span[text()='Register']")
	private WebElement registerbtn;
	

	public WebElement getMrBtn() {
		return mrBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getFlatname() {
		return flatname;
	}
	public WebElement getCityname() {
		return cityname;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCode() {
		return code;
	}
	public WebElement getCountryname() {
		return countryname;
	}
	public WebElement getOtherbox() {
		return otherbox;
	}
	public WebElement getHomephn() {
		return homephn;
	}
	public WebElement getMobilephn() {
		return mobilephn;
	}
	public WebElement getAssignaddress() {
		return assignaddress;
	}
	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getCreateAcbtn() {
		return CreateAcbtn;
	}
	public CreateAc(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}
}
