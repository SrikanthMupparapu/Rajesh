package com.sample.manoj123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	String URL=" http://www.demo.guru99.com/V4/";
	driver.get(URL);
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr392872");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("amyvaqE");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	Thread.sleep(5000);
	File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destfile= new File("./screenshots/img.000");
	FileUtils.copyFile(sourcefile, destfile);
	System.out.println("screenshot captured");
	driver.quit();
	}

}
