package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class AdactinLoginPage {
	
	public static WebDriver driver;
	
	@Given("User has to be there in Adactin login page")
	public void user_has_to_be_there_in_Adactin_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Kannan\\Adactin\\Driver Updated\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
	}

	@When("User has to fill username {string} and password {string}field")
	public void user_has_to_fill_username_and_password_field(String s1, String s2) {
		driver.findElement(By.id("username")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);

	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		driver.findElement(By.id("login")).click();

	}

	@Then("verify user is navigating to login attempt page")
	public void verify_user_is_navigating_to_login_attempt_page() {
	   String text = driver.findElement(By.xpath("//b[contains(text(),'Invalid Login')]")).getText();
	   System.out.println(text);
	}



}
