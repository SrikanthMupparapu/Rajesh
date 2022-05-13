package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssessment3 {

	public static void main(String[] args) throws InterruptedException {
	/*WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/login.php");
 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div[2]/button")).sendKeys("suramrajesh");
 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("7330283203");
 driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
 System.out.println("the operation is done by me");
    Thread.sleep(8000);
    driver.quit();*/
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div/input")).click();
   
	}

}
