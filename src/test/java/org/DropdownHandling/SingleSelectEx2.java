package org.DropdownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx2 {

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
       //Step 4 :-->add test data from manual test case
		ArrayList<String> expList = new ArrayList<String>();
		List<WebElement> colorList = sel.getOptions();
		for(int i=0; i<colorList.size(); i++) {
			System.out.println(colorList.get(i).getText());
		}
		// Step 5 :--> select data in dropdown
		sel.selectByVisibleText("Purple");  //purple
		//sel.selectByValue("5");             //black
		//sel.selectByIndex(7);               //violet
		
		//Step 6:--> Verify purple color is selected not?
		//getFirstSelectedOption()  --->webelement -->getText
		//if-else -> compare with purple
		
		selectedWebElement = sel.getFirstSelectedOption();
		defaultcolor = selectedWebElement.getText();
		if(defaultcolor.equals("Purple")) {
			System.out.println("Purple color is selected by default");

		}else {
			System.out.println("Purple color is NOT selected by default");

	}
		System.out.println("** PROGRAM ENDS **");
	}	
		public ArrayList<String> getDropdownAllOptionsText(WebElement ele)
		 {
			ArrayList<String> ar = new ArrayList<String>();
			Select sel1 = new Select(ele);
			List<WebElement> allEles = sel1.getOptions();
			
			for(int i =0; i<allEles.size(); i++) {
			//	WebElement ele1 = allEles.get(i);
			//	String text = ele1.getText();
			//	ar.add(text);
				ar.add(allEles.get(i).getText());
				
			}
		return ar;
		}
}
