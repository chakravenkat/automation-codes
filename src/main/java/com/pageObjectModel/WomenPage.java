package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement printed;
	
	@FindBy(xpath = "(//a[@class='quick-view'])[1]")
	private WebElement qucikview;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement casual;
	
	public WebElement getCasual() {
		return casual;
	}

	public WomenPage(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getPrinted() {
		return printed;
	}

	public WebElement getQucikview() {
		return qucikview;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement plusBtn;
	
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement Size;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement Addtocart;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
