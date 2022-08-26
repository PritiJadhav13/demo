 package org.GenericMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public void dbclick(WebDriver driver) {
		WebElement1 obj = new WebElement1(driver);
		Actions act = new Actions(driver);
		act.doubleClick(obj.doubleclick()).perform();
	}	
		public void rightclick(WebDriver driver) {
			WebElement1 obj = new WebElement1(driver);
			Actions act = new Actions(driver);
			act.contextClick(obj.rightclick()).perform();
			
	}
		public void dynamicclick(WebDriver driver) {
			WebElement1 obj = new WebElement1(driver);
			Actions act = new Actions(driver);
			act.click(obj.click()).perform();
		}	
	public static void main(String[] args) {
		GenericMethod ob = new GenericMethod();
		String url = "https://demoqa.com/buttons";
		WebDriver driver = ob.startUp("ch", url);
		Test1 te = new Test1();
		te.dbclick(driver);
		te.rightclick(driver);
		te.dynamicclick(driver);
		

		
	}

}
