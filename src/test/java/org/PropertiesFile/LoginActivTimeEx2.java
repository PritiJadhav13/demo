package org.PropertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class LoginActivTimeEx2 {

	public static void main(String[] args) {
		System.out.println("*** Program Starts ***");
         ConfigReader cr = new ConfigReader();
         String bName = cr.getconfigData("browdserName");         
         String url = cr.getconfigData("url");
         String uname = cr.getconfigData("username");
         String pwd = cr.getconfigData("password");
         BaseUtility bu = new BaseUtility();
         WebDriver driver = bu.StartUp(bName, url);
         driver.findElement(By.id("username")).sendKeys("uname");
         driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("pwd");
         driver.findElement(By.cssSelector("username")).click();
         
         System.out.println("*** Program Ends ***");
	}

}
