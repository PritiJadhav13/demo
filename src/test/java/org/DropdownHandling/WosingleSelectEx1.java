package org.DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class WosingleSelectEx1 {

	public static void main(String[] args) {
		
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
   
		WebElement selValueDDL = driver.findElement(By.cssSelector("#withOptGroup .css-1wa3eu0-placeholder"));
		selValueDDL.click();
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//div[text() = 'Group 1, option 2']")).click();
		System.out.println("** PROGRAM ENDS **");
	
	
	
	
	
	}

}
