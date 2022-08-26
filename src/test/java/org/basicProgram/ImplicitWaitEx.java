package org.basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);


		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//Thred.sleep(5000);
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		bu.waitForVisibilityofWebElementByType(driver,5,"id","logoutLink");
		System.out.println("** PROGRAM ENDS **");

	}

}
