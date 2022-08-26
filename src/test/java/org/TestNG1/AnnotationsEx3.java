package org.TestNG1;

import org.PropertiesFile.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class AnnotationsEx3 {

	private WebDriver driver;
	String str;
	@BeforeMethod
	public void login() {
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
		System.out.println("Login Successful");
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		System.out.println("Logout and browser closed");
	}
	@Test
	public void ValiddataDashboardTitle() {
		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTime - Enter Time-Track";
		System.out.println("actDashTitle :"+actDashTitle);

		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("Dashboard Title verified successfuly");
		}else {
			System.out.println("DashboardTitle Changed");
		}
	}

	public void ValiddataDashboardUrl() {

		String actDashUrl = driver.getCurrentUrl();
		String expDashUrl = "http://localhost//submit_tt.do";
		System.out.println("actDashTitle :"+actDashUrl);

		if(actDashUrl.equals(expDashUrl)) {
			System.out.println("Dashboard Url verified successfuly");
		}else {
			System.out.println("Dashboard Url changed");
		}

	}}

