package com.model;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[2]/div/a/span")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> iterator =  window.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Pooja");
	}

}
