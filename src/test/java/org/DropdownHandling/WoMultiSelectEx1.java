package org.DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class WoMultiSelectEx1 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement selValueDDL = driver.findElement(By.xpath("//div[p[b[text()='MultiSelect drop down']]]//div[@class=' css-1wa3eu0-placeholder']"));
  //   bu.scrollByPageDown(driver, 1);
		bu.scrollByJs(driver, selValueDDL);
		
		selValueDDL.click();
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//div[text() = 'Green']")).clear();
	    driver.findElement(By.xpath("//div[text() = 'Black']")).click();
	    driver.findElement(By.xpath("//div[text() = 'Red']")).click();
	    
		System.out.println("** PROGRAM ENDS **");
	}

}
