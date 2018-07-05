package com.epicomm.app.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SampleStepDefs {
	WebDriver driver;

@Given("^User need to be on Facebook login page$")
public void user_need_to_be_on_Facebook_login_page() {
	System.getProperty("webdriver.chrome.driver","D:\\Naveen Bhai\\Naveen\\Browser Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	driver.get("https://www.facebook.com/");
}

@When("^user enters user first name$")
public void user_enters_user_first_name()  {
    driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Lalit");
}

@Then("^User checks user first name is present$")
public void user_checks_user_first_name_is_present()  {
    String expectedValue = "Lalit";
    String actualValue = driver.findElement(By.xpath("//input[@id='u_0_j']")).getAttribute("value");
    Assert.assertEquals(expectedValue, actualValue);

}
}
