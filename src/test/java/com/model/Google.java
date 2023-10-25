package com.model;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		
//		driver.get("https://www.selenium.dev");
//		driver.findElement(By.xpath("//a[text()='English']")).click();
//		driver.findElement(By.xpath("//a[@href='#']")).click();
//		driver.findElement(By.xpath("//a[@href='#' and @role='button']")).click();
	
	}

}

