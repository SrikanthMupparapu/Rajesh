package com.sample.manoj123;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru98 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("suramrajesh");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).isSelected();
	driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("11/08/1996");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("H.NO:15-7-136/130,RAMANNAPET,RAGHUNATH COLONY,WARANGAL 506002");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("warangal");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("TELANGANA");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("506002");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("7330283203");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("suramrajesh42538@gmail.com");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("Suram@1996");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollBy(0, 4500");
//	File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	File destfile= new File("./screenshots/img.0002");
//FileUtils.copyFile(sourcefile, destfile);
		Thread.sleep(8000);
		driver.quit();
	}

}
