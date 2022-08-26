package org.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\maven\\OM\\driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");    
		driver.manage().window().maximize();
		driver.findElement(By.className("_2doB4z")).click();		
		driver.findElement(By.name("q")).sendKeys("SamsungM32");

	}

}
