package org.GenericMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElement1 {
	WebDriver driver;
	WebElement1(WebDriver driver){
		this.driver = driver;
	}
	public WebElement doubleclick() {
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		return doubleclick;
	}
	public WebElement rightclick() {
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		return rightclick;
	}
		public WebElement click() {
			WebElement click = driver.findElement(By.id("oIbZW"));
			return click;
		
	}
}