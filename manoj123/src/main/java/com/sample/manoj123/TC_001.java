package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	WebDriver driver=null;
	
	
	@BeforeTest
	public void  OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.thepancard.com/");
		driver.findElement(By.xpath("//*[@id=\"page-wrap\"]/div[1]/div[2]/div/div/ul/li[1]/a/b")).click();
		System.out.println(driver.findElement(By.id("rblCategory_0")).isSelected());
		
	}
@AfterTest
public void CloseBrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.thepancard.com/");
	driver.findElement(By.xpath("//*[@id=\"page-wrap\"]/div[1]/div[2]/div/div/ul/li[1]/a/b")).click();
	driver.findElement(By.id("txtDOB")).sendKeys("11/05/1663");




}
@BeforeMethod
public void Delete() {
	 System.out.println("printed deleted");
}
@Test
public void Demo()
{
	System.out.println("Demo.................");
}
@AfterMethod
public void show() {
	System.out.println("show");
}
@Test
public void open() {
	System.out.println("opened videos");
}
}

	
