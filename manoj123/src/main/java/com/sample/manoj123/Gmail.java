 package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/login.php");
driver.findElement(By.name("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));
driver.findElement(By.name("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("suramrajesh");
Thread.sleep(2000);
driver.quit();
	}

}
