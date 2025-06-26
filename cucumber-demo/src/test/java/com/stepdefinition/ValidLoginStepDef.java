package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidLoginStepDef {
	
	WebDriver driver=null;
	 
	@Given("the browser is open")
	public void the_browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		 driver.get("https://www.saucedemo.com/");
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username); 
        driver.findElement(By.id("password")).sendKeys(password);  
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		 driver.findElement(By.id("login-button")).click();
	}
	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		String actualTitle = driver.getTitle();
		System.out.println("Current Title: " + actualTitle);
		Assert.assertEquals("User is not navigated to the home page.", "Swag Labs", actualTitle);
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}




	


}
