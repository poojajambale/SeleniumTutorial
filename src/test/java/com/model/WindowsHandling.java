 package com.model;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div[4]/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/div/a/span"))).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Pooja");
//		driver.quit();
	}

}
