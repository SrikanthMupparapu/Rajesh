package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {

	@BeforeMethod

	public static void main(String[] args) throws InterruptedException {
		System.out.println("ifhi .........................................");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("7330283203", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}
}
