package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru97 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://web.archive.org/web/20130912174855/https://www.facebook.com/BrowardCollege");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("suram");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("7330283203");
	driver.findElement(By.xpath("//*[@id=\"persist_box\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"u_0_1\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).sendKeys("suramrajesh");
	System.out.println(driver.getTitle());
//	driver.findElement(By.xpath("//*[@id=\"persist_box\"]")).isEnabled();
	//driver.switchTo().alert().sendKeys("suram");
	Thread.sleep(5000);

	driver.quit();
	}

}
	/*@test

	public static void  main(String srgs[]) throws InterruptedException{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("7330283203",Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	  driver.quit();
	
		
	}
}
*/
