package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class LoginActiTimeEx1 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);

		
		//By uName = By.cssSelector("input[id='username']");
		//driver.findElement(uName);
		
		//driver.findElement(By.cssSelector("input[id='username']"));
		
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("admin");
		
		WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
		pwdField.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
		loginBtn.click();
		
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("** PROGRAM ENDS **");
		
		
	}

}
