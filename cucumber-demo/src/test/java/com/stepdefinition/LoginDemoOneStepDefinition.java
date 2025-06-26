package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoOneStepDefinition {
	
	
	WebDriver driver=null;
	 
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		 driver.get("https://www.saucedemo.com/");
	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		 driver.findElement(By.id("login-button")).click();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() throws InterruptedException {
		String actualTitle = driver.getTitle();
		System.out.println("Current Title: " + actualTitle);
		Assert.assertEquals("User is not navigated to the home page.", "Swag Labs", actualTitle);
		Thread.sleep(2000);
driver.close();
driver.quit();
	}
	
		
	
	




}
