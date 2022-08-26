package org.DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx1 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
		// Step1 :--> identify the dropdown WebElement
		WebElement colorDDL = driver.findElement(By.id("oldSelectMenu"));
		bu.scrollByJs(driver, colorDDL);
   
		//Step2 :--> Creat object of select class by passing ddl object
		Select sel = new Select(colorDDL);
		
		//Step3 :--> Verify default selected option
		WebElement selectedWebElement = sel.getFirstSelectedOption();
		String defaultcolor = selectedWebElement.getText();
		if(defaultcolor.equals("Red")) {
			System.out.println("Red color is selected by default");
			
		}else {
			System.out.println("Red color is NOT selected by default");
		}
		System.out.println("** PROGRAM ENDS **");
	}

}
