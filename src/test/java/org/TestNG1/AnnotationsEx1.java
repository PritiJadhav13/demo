package org.TestNG1;

import org.PropertiesFile.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class AnnotationsEx1 {
	@Test
	public void ValiddataDashboardTitle() {

		ConfigReader cr = new ConfigReader();
		String bName = cr.getconfigData("browdserName");         
		String url = cr.getconfigData("url");
		String uname = cr.getconfigData("username");
		String pwd = cr.getconfigData("password");

		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp(bName, url);
		driver.findElement(By.id("username")).sendKeys("uname");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("pwd");

		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityofWebElementByType(driver, 10,"id", "logout");

		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTime - Enter Time-Track";
		System.out.println("actDashTitle :"+actDashTitle);

		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("Login Successful.");
		}else {
			System.out.println("Unable to login.");
		}

		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
public void ValiddataDashboardURL() {

	ConfigReader cr = new ConfigReader();
	String bName = cr.getconfigData("browdserName");         
	String url = cr.getconfigData("url");
	String uname = cr.getconfigData("username");
	String pwd = cr.getconfigData("password");

	BaseUtility bu = new BaseUtility();
	WebDriver driver = bu.StartUp(bName, url);
	driver.findElement(By.id("username")).sendKeys("uname");
	driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("pwd");

	driver.findElement(By.cssSelector("#loginButton>div")).click();
	bu.waitForVisibilityofWebElementByType(driver, 10,"id", "logout");

	String actDashTitle = driver.getTitle();
	String expDashTitle = "actiTime - Enter Time-Track";
	System.out.println("actDashTitle :"+actDashTitle);

	if(actDashTitle.equals(expDashTitle)) {
		System.out.println("Login Successful.");
	}else {
		System.out.println("Unable to login.");
	}

	driver.findElement(By.id("logoutLink")).click();
	driver.close();
}}	



