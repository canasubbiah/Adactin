package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Kannan\\Adactin\\Driver Updated\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void fill(WebElement e, String s) {
		e.sendKeys(s);	
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void dropDown(WebElement e, String visibleText) {
		Select s = new Select(e);
		s.selectByVisibleText(visibleText);

	}
	
	public static void waitElementToBeClickable(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.elementToBeClickable(e));

	}

}
