package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

String U = "https://www.google.com/";					
driver.get(U);	
WebElement search=driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
search.sendKeys("suram rajesh");
search.click();
search.clear();
Thread.sleep(5000);
//driver.findElement(By.id("continue")).click();
//driver.findElement(By.linkText("service-var-2 bg-clr2 animated flipInY clearfix go")).click();
driver.quit();


}}