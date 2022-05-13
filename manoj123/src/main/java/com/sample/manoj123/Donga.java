package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Donga {

	public static WebDriver driver;
	@Test(groups = "one",priority = 0)
public void OpenBrowser()
{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("http://www.google.com");
	}
	
	@Test(groups = "one",priority = 1)
	public void Gmail()
	{
	 driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	 System.out.println(driver.getTitle());
	
	}
	
	@Test(groups = "one",priority = 2)
	public void UseAnotherAccount()
	{
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[2]/div")).click();
	}
	
	@Test(groups = "one",priority = 3)
public void CloseBrowser()
{
	driver.close();
	driver.quit();
	}

}
