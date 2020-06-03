package org.stepdefinitionadactinful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.AdactinPojo;

import cucumber.api.java.en.*;

public class AdactinFullSite extends BaseClass{

@Given("User has to be there in Adactin home page")
public void user_has_to_be_there_in_Adactin_home_page() {
	launchBrowser();
	loadUrl("http://adactinhotelapp.com/");
    
}

@When("User has to fill the username and password")
public void user_has_to_fill_the_username_and_password() {
 AdactinPojo ap =  new AdactinPojo();
 fill(ap.getTxtUserName(),"canasubbiah");
 fill(ap.getTxtPassword(), "July@1991");
 
}

@When("User has to click login button")
public void user_has_to_click_login_button() {
	 AdactinPojo ap =  new AdactinPojo();
  click(ap.getBtnLogin());
}

@When("User has to select desired location")
public void user_has_to_select_desired_location() {
	AdactinPojo ap =  new AdactinPojo();
	waitElementToBeClickable(ap.getLocation());
   dropDown(ap.getLocation(), "New York");
}

@When("User has to select desired hotels")
public void user_has_to_select_desired_hotels() {
	AdactinPojo ap =  new AdactinPojo();
	dropDown(ap.getHotels(), "Hotel Sunshine");

}

@When("User has to select Room type")
public void user_has_to_select_Room_type() {
	AdactinPojo ap =  new AdactinPojo();
	
	dropDown(ap.getRoomType(), "Deluxe");
}

@When("User has to select number of person")
public void user_has_to_select_number_of_person() {
	WebElement nos = driver.findElement(By.id("room_nos"));
	
	dropDown(nos, "1 - One");
}

@When("User has to select check in and check out date")
public void user_has_to_select_check_in_and_check_out_date() {
	AdactinPojo ap =  new AdactinPojo();
	fill(ap.getDateIn(), "20/06/2020");
	fill(ap.getDateIn(), "25/06/2020");
	
}

@When("User has to select number of adult and child per room")
public void user_has_to_select_number_of_adult_and_child_per_room() {
	AdactinPojo ap =  new AdactinPojo();
	dropDown(ap.getAdultRoom(), "2 - Two");
	dropDown(ap.getChildRoom(), "1 - One");
	
}

@When("User has to click search button")
public void user_has_to_click_search_button() {
	AdactinPojo ap =  new AdactinPojo();
	click(ap.getSubmit());
    
}

@When("User has to select radio button and click contine button")
public void user_has_to_select_radio_button_and_click_contine_button() {
	
	AdactinPojo ap =  new AdactinPojo();
	waitElementToBeClickable(ap.getRadioButton());
	click(ap.getRadioButton());
	click(ap.getCont());
    
}

@When("User has to fill first name and last name")
public void user_has_to_fill_first_name_and_last_name() {
	AdactinPojo ap =  new AdactinPojo();
	fill(ap.getFirstName(), "Kannan");
	fill(ap.getLastName(), "Subbiah");
}

@When("User has to fill billing address")
public void user_has_to_fill_billing_address() {
	AdactinPojo ap =  new AdactinPojo();
	fill(ap.getAddress(), "Mahindra World City, Chennai");
	
}

@When("User has to fill credit card no")
public void user_has_to_fill_credit_card_no() {
	AdactinPojo ap =  new AdactinPojo();
	fill(ap.getCcNum(), "4382280094958929");
}

@When("User has to select credit card type")
public void user_has_to_select_credit_card_type() {
	AdactinPojo ap =  new AdactinPojo();
	dropDown(ap.getCcType(), "VISA");
  
}

@When("User has to select expiry date and year")
public void user_has_to_select_expiry_date_and_year() {
	AdactinPojo ap =  new AdactinPojo();
    dropDown(ap.getCcExpMonth(), "July");
    dropDown(ap.getCcExpYear(), "2017");
}

@When("User has to fill cvv number")
public void user_has_to_fill_cvv_number() {
	AdactinPojo ap =  new AdactinPojo();
	fill(ap.getCcv(), "789");
}

@When("User hs to click book now button")
public void user_hs_to_click_book_now_button() throws InterruptedException {
	AdactinPojo ap =  new AdactinPojo();
	click(ap.getBookNow());
	Thread.sleep(5000);
}

@When("Verify user is able to navigate to booking confirmation page and print the order no in console")
public void verify_user_is_able_to_navigate_to_booking_confirmation_page_and_print_the_order_no_in_console() throws InterruptedException {
	
	WebElement myorder = driver.findElement(By.id("order_no"));
	String text = myorder.getAttribute("value");
	System.out.println(text);
	WebElement myiti = driver.findElement(By.id("my_itinerary"));
	Thread.sleep(5000);
	myiti.click();
	
}
}
