package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits1 {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10) );
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']")));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("gdcmlgj,cyd");
		
	}

}
