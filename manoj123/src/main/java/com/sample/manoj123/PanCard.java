package com.sample.manoj123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PanCard {
	WebDriver driver=null;
	@Given("Open browser and navigate to required url")
	public void open_browser_and_navigate_to_required_url() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.get("https://www.thepancard.com/");
	  
	}

	@Then("click on the  applynew pancard")
	public void click_on_the_applynew_pancard() {
		driver.findElement(By.linkText("Apply New PAN Card")).click();
	
	}
	@Then("enter details of candidate")
	public void enter_details_of_candidate() {
		driver.findElement(By.id("rblCategory_0")).click();
		driver.findElement(By.id("txtDOB")).sendKeys("11/08/1996");
		driver.findElement(By.id("rblGender_0")).click();
		driver.findElement(By.id("txtMobNo")).sendKeys("7330283203");
	 
	}
	

	//@Then("click on apply duplicate pancard")
	//public void click_on_apply_duplicate_pancard() {
		//driver.findElement(By.linkText("Apply Duplicate PAN Card")).click();
	  
//	}

/*	@Then("enter details of candidate")
	public void details_of_candidate() {
		driver.findElement(By.id("rblCategory_0")).click();
		driver.findElement(By.id("txtDOB")).sendKeys("11/08/1996");
		driver.findElement(By.id("rblGender_0")).click();
		driver.findElement(By.id("txtMobNo")).sendKeys("7330283203");
	 
	}*/

	@Then("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.id("submit")).click();
	    	}

}
