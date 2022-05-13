package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/search?q=cricbuzz&rlz=1C1CHBD_enIN924IN924&oq=&aqs=chrome.1.69i59i450l8.1541935268j0j15&sourceid=c");
		System.out.println("rajesh");
		driver.quit();
		driver.findElement(By.id("MqXdYazBDLaUseMP5YSLsAU1"));



	}

//	private static void highlight(WebDriver driver, WebElement findElement) {
		// TODO Auto-generated method stub
		
	}

//}
