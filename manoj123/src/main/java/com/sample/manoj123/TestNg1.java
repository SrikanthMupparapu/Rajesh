package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg1 {
	
	
	@Test
	public void TestGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	 driver.findElement(By.name("q")).sendKeys("SURAM RAJESH",Keys.ENTER);
System.out.println(driver.getTitle());
Thread.sleep(3000);
driver.quit();

	}
	@Test
	public void TestYoutube() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	 driver.findElement(By.name("search_query")).sendKeys("SURAM RAJESH");
System.out.println(driver.getTitle());
Thread.sleep(3000);


}
}
