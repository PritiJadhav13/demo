package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class WebDriverManager {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);

		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		bu.waitForVisibilityofWebElementByType(driver, 10, "id", "logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		 System.out.println("** PROGRAM ENDS **");

	}

}
