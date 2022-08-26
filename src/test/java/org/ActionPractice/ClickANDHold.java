package org.ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ClickANDHold {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.StartUp("ch", url);	

		WebElement src = driver.findElement(By.id("droppable"));
		//WebElement des = driver.findElement(By.id("droppable"));
		Actions act =  new Actions(driver);
		// act.moveToElement(src).clickAndHold(des)
		//    .moveToElement(src).release().build().perform();
		act.contextClick(src).perform();
		System.out.println("** PROGRAM ENDS **");
	}
}


