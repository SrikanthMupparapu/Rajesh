package com.sample.manoj123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver1 {

	public static void main(String[] args) throws IOException {
	//	String s="firefox";
	//	String s2="firefox";
	//	String b=new  String("firefox");
	//	String b1=new  String("firefox1");

	//	System.out.println(b.equals(b1));

		
	//	String s1="edgebrowser";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ww6.ibomma.bar/telugu-movies/");
	 File sourceFile= driver.getScreenshotAs(OutputType.FILE);
	 File destFile= new File(" ./Rajesh/img23.png");
	 FileUtils.copyFile(sourceFile, destFile);
	 System.out.println("the screenshot captured succesfully");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getClass());
		//System.out.println(s.equals(s1));
	//	System.out.println(s==s2);

		driver.quit();

//		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
	//	File destfile = new File("/manoj123/ScreenShot");
	//	FileUtils.copyFile(sourcefile, destfile);
	//	Thread.sleep(5000);
	//	System.out.println("screenshot captured succesfully");
	//	driver.quit();
		// byte[] bytearr=driver.getScreenshotAs(OutputType.BYTES);
		// File sourcefile=driver.getScreenshotAs(OutputType.FILE);
//	File destfile=new File("./ScreenShot/img12.png");
//	FileUtils.copyFile(sourcefile, destfile);
	}
}
