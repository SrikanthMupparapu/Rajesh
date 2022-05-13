package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TS001 = User able to rigister using any username and password without any problem
	//	LOGIN
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
	    WebElement  login=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input "));
	    WebElement password=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
     	login.sendKeys("suram");
        password.sendKeys("SURAM");
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button")).click();
    //   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div[2]/button")).click();
     //  driver.findElement(By.name("fullname")).sendKeys("suramrajesh");
       
      
     	Thread.sleep(8000);
	   driver.quit();
	   
	
	
	
	}

}
