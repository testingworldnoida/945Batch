package org.testcases.steps;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.test.assertion.Validation;
import org.test.pages.LoginPage;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class TC_002{
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("^a user is on the Login page \"([^\"]*)\"$")
	public void a_user_is_on_the_Login_page(String arg1) throws Throwable {
		driver = Base.startDriver();
		loginPage =  new LoginPage(driver);
	}

	@Then("^user gets email textbox$")
	public void user_email_textbox() throws Throwable {
		 Assert.assertTrue("Element not Found", Validation.checkElementExists(driver, "//input[@id='email']"));
	}

	@When("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
		loginPage.enterUsername(arg1); 
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		 Assert.assertTrue("Element not Found", Validation.checkElementExists(driver, "//input[@id='pass']"));
	}
	
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		loginPage.clickSignin();
	}	
}
