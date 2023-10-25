package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='url']"));
		
		Select select = new Select(dropDown);
		select.selectByIndex(0);
		select.selectByValue("search-alias=arts-crafts-intl-ship");
		select.selectByVisibleText("Automotive");
		System.out.println(select.getAllSelectedOptions());
		select.deselectByIndex(0);
	}

}
