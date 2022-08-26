package org.BasicMethodEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class RadioButton {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);

		WebElement yesRadio = driver.findElement(By.id("yesRadio"));
		WebElement yesLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
		WebElement impRadio = driver.findElement(By.id("impressiveRadio"));
		WebElement noRadio = driver.findElement(By.id("noRadio"));
        if(yesLabel.isDisplayed()) {
        	System.out.println("impLabel.isDisplayed() : "+yesLabel.isDisplayed());
        	//yesRadio.click();
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        //s.executeScript(null, args);
		if(yesRadio.isSelected()) {
			System.out.println("Yes Radio button is selected");
			//System.out.println("impRadio.isSelected() : "+yesRadio.isSelected());
			
		}else {
			System.out.println("Yes Radio button is NOT selected");
			//System.out.println("impRadio.isSelected() : "+yesRadio.isSelected());	
		}
	  } else {
	
        System.out.println("impRadio.isDisplayed() :"+yesLabel.isDisplayed());
	  }

	if(!noRadio.isEnabled()) {
		System.out.println("No radio button is disabled.");
	}else {
	System.out.println("*** PROGRAM ENDS ***");
	}}}