package org.ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ToolTipEx {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement btn = driver.findElement(By.id("toolTipButton"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).perform();
		String toolTip = driver.findElement(By.cssSelector(".toolTip-inner")).getText();
		System.out.println("toolTip: "+toolTip);
	   
        System.out.println("** PROGRAM Ends **");


	}

}
