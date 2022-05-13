package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("rajesh");
driver.findElement(By.name("q")).submit();
Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/login/");
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("9000505544");
driver.findElement(By.id("email")).submit();
Thread.sleep(3000);
driver.navigate().back();
 Thread.sleep(3000);
 driver.quit();
	}

	
}
