package com.sample.manoj123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver=null;
	
	@Given("open browser and navigate to required url")
	
	public void open_browser_and_navigate_to_required_url() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	}

	@When("enter user name and password and click on login")
	public void enter_user_name_and_password_and_click_on_login() {
		
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println("home page should be displayed");
	
	}

	@When("click on PIM ,click on employee and enter employee details")
	public void click_on_pim_click_on_employee_and_enter_employee_details() {
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("suram rajesh");
		driver.findElement(By.id("employeeId")).sendKeys("73302");
		
	 
	}

	@When("click on welcome")
	public void click_on_welcome() {
		driver.findElement(By.id("welcome")).click();
	
	}

	@When("close browser")
	public void close_browser() {
		driver.quit();
	 
	}
}
