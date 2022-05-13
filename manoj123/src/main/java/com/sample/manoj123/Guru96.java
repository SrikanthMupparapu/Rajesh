package com.sample.manoj123;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru96 {
	@Test(dataProvider = "GuruTest")
	public void testCase04(String username, String password) throws Exception {
		String actualTitle;
		String actualBoxMsg;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new Chromedriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();

