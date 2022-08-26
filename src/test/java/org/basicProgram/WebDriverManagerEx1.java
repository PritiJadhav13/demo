package org.basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class WebDriverManagerEx1 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);

		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityofWebElementByType(driver, 10, "id", "logoutLink");
		
		List<WebElement> allTabs = driver.findElements(By.cssSelector("td[class^='navItem navCell']>a"));
		for(int i=0; i<allTabs.size(); i++) {
			if(allTabs.get(i).getAttribute("class").contains("selected")) {
				System.out.println("Tab '"+i+"' is selected.");
			}else {
				System.out.println("Tab '"+i+"' is selected.");
		}
		
	//	driver.findElement(By.id("logoutLink")).click();
		 System.out.println("** PROGRAM ENDS **");


	}

	}}
