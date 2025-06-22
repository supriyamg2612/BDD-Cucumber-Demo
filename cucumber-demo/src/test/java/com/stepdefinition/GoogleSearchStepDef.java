package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	
	WebDriver driver=null;
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[text()='Reject all']")).click();	
		System.out.println("Inside Step - user is on goolge search page");
	   
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("BDD Cucumber");
		Thread.sleep(2000);
		System.out.println("Inside Step - user enters a text in search box");	
	    
	}

	@When("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Inside Step - hits enter");
	  
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Cucumber");
		System.out.println("Inside Step - user is navigated to search results");

		driver.close();
		driver.quit();
	}




}
