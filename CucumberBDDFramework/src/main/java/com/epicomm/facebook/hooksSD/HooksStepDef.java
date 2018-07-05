package com.epicomm.facebook.hooksSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class HooksStepDef {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("Inside setUp");
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen Bhai\\Naveen\\Browser Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() {
		driver.get("https://www.facebook.com/");
	}
	
	@After(order=2) //Higher value will be executed first
	public void tearDown1() {
		System.out.println("Inside tearDown1");
		driver.quit();
		driver = null;
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("Inside teadDown2");
	}
}
