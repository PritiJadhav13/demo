package org.ActionPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class ActiveElementEx {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);	
        driver.switchTo().activeElement().sendKeys("admin");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("manager");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		System.out.println("** PROGRAM Ends **");

	}

}
