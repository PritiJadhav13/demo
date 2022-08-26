package org.TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class DataProviderEx1 {
	@Test(dataProvider="loginCredentials")
	public void loginTC(String uName, String pwd) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.findElement(By.id("username")).sendKeys("uName");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("pwd");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityofWebElementByType(driver,10,"id","logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("** PROGRAM ENDS **");
	}

	@DataProvider
	public Object[][] loginCredentials(){
		Object[][] ar = new Object[4][2];
		ar[0][0] = "admin";
		ar[0][1] = "manager1";		 

		ar[1][0] = "admin1";
		ar[2][1] = "manager";	

		ar[2][0] = "admin";
		ar[2][1] = "manager1";	

		ar[3][0] = "admin5";
		ar[3][1] = "manager5";
		return ar;	
	}

}