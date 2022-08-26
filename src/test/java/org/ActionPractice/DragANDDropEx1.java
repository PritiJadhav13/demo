package org.ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class DragANDDropEx1 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.StartUp("ch", url);	
		
		WebElement src = driver.findElement(By.id("droppable"));
		Actions act =  new Actions(driver);
        act.dragAndDropBy(src, 250,70).perform();
        
        System.out.println("** PROGRAM ENDS **");
	}
	}


