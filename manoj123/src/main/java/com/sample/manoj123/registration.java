package com.sample.manoj123;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().setSize(new Dimension(1050, 652));
	    driver.findElement(By.id("u_0_2_fC")).click();
	    driver.findElement(By.id("u_3_b_Kk")).click();
	    driver.findElement(By.id("u_3_b_Kk")).sendKeys("suram");
	    driver.findElement(By.id("u_3_d_uo")).sendKeys("rajesh");
	    driver.findElement(By.id("u_3_g_KM")).sendKeys("7330283203");
	    driver.findElement(By.id("password_step_input")).sendKeys("7330283203");
	    driver.findElement(By.id("day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("day"));
	      dropdown.findElement(By.xpath("//option[. = '7']")).click();
	    }
	    driver.findElement(By.id("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("month"));
	      dropdown.findElement(By.xpath("//option[. = 'Jul']")).click();
	    }
	    driver.findElement(By.id("year")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("year"));
	      dropdown.findElement(By.xpath("//option[. = '2021']")).click();
	    }
	    driver.findElement(By.id("year")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("year"));
	      dropdown.findElement(By.xpath("//option[. = '1996']")).click();
	    }
	    driver.findElement(By.id("u_3_5_nt")).click();
	  }
	

	}


