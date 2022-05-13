package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssessmentTest1 {

	public static void main(String[] args) throws InterruptedException {
		//REGISTER 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div[2]/button")).click();
	driver.findElement(By.name("fullname")).sendKeys("SURAM RAJESH");
	driver.findElement(By.name("dateOfBirth")).sendKeys("11/08/1996");
	driver.findElement(By.name("mobileNumber")).sendKeys("7330283203");
	driver.findElement(By.name("address")).sendKeys("WARANGAL");
	Thread.sleep(5000);
	driver.quit();
	}

}
