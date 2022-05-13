package com.sample.manoj123;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTitle {

	public static void main(String[] args) throws InterruptedException, IOException {
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("rajeshsuram");
		driver.findElement(By.id("search")).submit();
		  
	//	driver.findElement(By.name("password")).submit();
		//driver.findElement(By.id("passContainer")).sendKeys("7330283203");
	//	driver.findElement(By.id("passContainer")).submit();
		//driver.findElement(By.id("passContainer")).sendKeys("9652995080");
		//driver.findElement(By.id("passContainer")).submit();
		Thread.sleep(3000);
		driver.quit();*/
		
	/*	import org.junit.Before;
		import org.junit.After;
		import static org.junit.Assert.*;
		import static org.hamcrest.CoreMatchers.is;
		import static org.hamcrest.core.IsNot.not;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.remote.RemoteWebDriver;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.Keys;
		import java.util.*;
		import java.net.MalformedURLException;
		import java.net.URL;*/
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
		/*    driver.get("https://online.tsrtcpass.in/counterstupass.do?prm=hyd");
		    driver.manage().window().setSize(new Dimension(786, 672));
		    driver.findElement(By.id("userProperties(ssctype)")).click();
		    driver.findElement(By.id("userProperties(sscpassfailyr)")).click();
		    driver.findElement(By.id("userProperties(sscpassfailyr)")).sendKeys("2012");
		    driver.findElement(By.id("userProperties(sscno)")).click();
		    driver.findElement(By.id("userProperties(sscno)")).sendKeys("1231107928");
		    driver.findElement(By.id("userProperties(passdob)")).click();
		    driver.findElement(By.id("userProperties(passdob)")).sendKeys("11/08/1996");
		    driver.findElement(By.id("youthname")).click();
		    driver.findElement(By.id("youthname")).click();
		    driver.findElement(By.id("youthname")).click();
		    driver.findElement(By.id("youthname")).sendKeys("SURAM RAJESH");
		    driver.findElement(By.id("youthfgname")).click();
		    driver.findElement(By.id("youthfgname")).sendKeys("SURAM KUMARASWAMY");
		    driver.findElement(By.id("gender2")).click();
		    driver.findElement(By.id("aadharno")).click();
		    driver.findElement(By.id("aadharno")).sendKeys("ODc2NjAyMTE1NTYw");
		    driver.findElement(By.id("studentmobileno")).click();
		    driver.findElement(By.id("studentmobileno")).sendKeys("7330283203");
		    driver.findElement(By.id("emailId")).click();
		    driver.findElement(By.id("emailId")).sendKeys("suramrajesh42538@gmail.com");
		    driver.findElement(By.id("distId")).click();
		    driver.findElement(By.id("distId")).click();
		    driver.findElement(By.id("man")).click();
		    driver.findElement(By.id("man")).click();
		    driver.findElement(By.id("vilId")).click();
		    driver.findElement(By.id("userProperties(pincode)")).click();
		    driver.findElement(By.id("userProperties(pincode)")).sendKeys("500038");
		    driver.findElement(By.id("instcollname")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("instcollname"));
		      dropdown.findElement(By.xpath("//option[. = 'NIZAMS INST.OF MEDICAL SCIENCES,PUNJAGUTTA---P3284']")).click();
		    }
		    driver.findElement(By.id("userProperties(admissionno)")).click();
		    driver.findElement(By.id("userProperties(admissionno)")).sendKeys("0011554454");
		    driver.findElement(By.id("instcourseid")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("instcourseid"));
		      dropdown.findElement(By.xpath("//option[. = 'B.Sc (Nursing) 4th Yr.']")).click();
		    }
		  }*/
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("suram");
		driver.findElement(By.name("q")).submit();
	//	File sourceFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	File destFile=new File("./Screenshots/img20.png");
	//	FileUtils.copyFile(sourceFile, destFile);
	//	System.out.println("the screenshot taken successfully");
		
		Thread.sleep(2000);
		driver.quit();
	
	}

		
	}


