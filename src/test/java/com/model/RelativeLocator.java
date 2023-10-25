package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		driver.findElement(with(By.tagName("input")).below(username)).sendKeys("password");
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		driver.findElement(with(By.tagName("input")).near(password)).click();
		
	}

}
