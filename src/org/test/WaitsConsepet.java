package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsConsepet {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("vicky46684fhkutgugug");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("gdcmlgj,cyd");
		
		
	}

}
