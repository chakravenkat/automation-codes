package com.bassMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Bass_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void get(String url) {
		driver.get(url);
	}

	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void currenturl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void NaviTo(String url) {
		driver.navigate().to(url);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static void Forward() {
		driver.navigate().forward();
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void select(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (option.equalsIgnoreCase("getoption")) {
			List<WebElement> options = s.getOptions();
			for (WebElement web : options) {
				System.out.println(web.getText());
			}
		} else if (option.equalsIgnoreCase("ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println("Is This MultipleDropdown " + multiple);

		} else if (option.equalsIgnoreCase("getfirstoption")) {
			WebElement stoption = s.getFirstSelectedOption();
			System.out.println(stoption);
		} else if (option.equalsIgnoreCase("getallselected")) {
			List<WebElement> all = s.getAllSelectedOptions();
			for (WebElement web : all) {
				System.out.println(web.getText());
			}
		}
	}

	public static void isDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Is The Element Displayed " + displayed);
	}

	public static void isEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Is This Element Enabled  " + enabled);
	}

	public static void isSelect(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Is This Element Selected  " + selected);
	}

	public static void alert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("ok")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("cancel")) {
			alert.dismiss();
		} else if (option.equalsIgnoreCase("gettext")) {
			String text = alert.getText();
			System.out.println(text);
		}
	}

	public static void Actions(WebElement element, String option) {
		Actions ac = new Actions(driver);
		if (option.equalsIgnoreCase("move")) {
			ac.moveToElement(element).build().perform();
		} else if (option.equalsIgnoreCase("rytclk")) {
			ac.contextClick().build().perform();

		} else if (option.equalsIgnoreCase("dblclk")) {
			ac.doubleClick().build().perform();
		} else if (option.equalsIgnoreCase("hold")) {
			ac.clickAndHold().build().perform();
		}
	}

	public static void screenshot(String png) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace-greens\\Selenium_Programs\\Screenshots\\" + png);
		FileUtils.copyFile((File) screenshotAs, des);
	}
public static void wait(String option) {
	if (option.equalsIgnoreCase("implicit")) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} else if (option.equalsIgnoreCase("Explicit")) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	}
	
}
	public static void waits(WebElement element, String option) {
		if (option.equalsIgnoreCase("implicit")) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else if (option.equalsIgnoreCase("Explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
		} else if (option.equalsIgnoreCase("visibleElement")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} else if (option.equalsIgnoreCase("alertpresent")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}

	public static void getAttribute(WebElement element, String option) {
		if (option.equalsIgnoreCase("value")) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
		} else if (option.equalsIgnoreCase("name")) {
			String string = element.getAttribute("name");
			System.out.println(string);
		}
	}

	public static void scroll(String value, String empty) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+value, "");
	}

	public static void scrollIntoView( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	}
	
	public static void JavaScriptclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
}
