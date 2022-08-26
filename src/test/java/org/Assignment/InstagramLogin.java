package org.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\maven\\OM\\driver/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create New Account")).click();
			WebElement username = driver.findElement(By.id("[id=\"u_2_b_BU\"]"));
			username.sendKeys("omnamah");
			//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shivaya");



	}

}
