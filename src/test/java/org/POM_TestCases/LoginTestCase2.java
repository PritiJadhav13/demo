package org.POM_TestCases;

import org.POM_Pages.DashboardPage;
import org.POM_Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.utility.BaseUtility;

public class LoginTestCase2 {
	private WebDriver driver;
	private BaseUtility bu = new BaseUtility();

	@BeforeMethod
	public void launchApllication() {
		String url = "http://localhost:90/login.do";
		 driver = bu.StartUp("ch", url);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	public void ValidateLoginPageTC001() {
		LoginPage lpObj = new LoginPage(driver);
		Assert.assertTrue(lpObj.isUserNameFieldDisplayed(), "User Name Field is not displayed");
		Assert.assertTrue(lpObj.isPasswordFiNameDisplayed(), "Password Field is not displayed");
		Assert.assertTrue(lpObj.isloginBtnDisplayed(), "login Button Field is not displayed");
		Assert.assertTrue(lpObj.keepMeLoginCheckBoxDisplayed(), "Keep Me Login CheckBox  not displayed");
		Assert.assertTrue(lpObj.isloginLogosDisplayed(), "Activetime Logos is not displayed");
        driver.close();
	}


	public void ValidateLoginFunctionalityTC002() {
		LoginPage lpObj = new LoginPage(driver);
		lpObj.enterPassword("admin");
		lpObj.enterPassword("manager");
		lpObj.ClickOnLoginBtn();
		bu.waitForVisibilityofWebElementByType(driver,10,"id","logoutLink");
		
		DashboardPage dpObj = new DashboardPage(driver);
		Assert.assertTrue(dpObj.getDashboardTitle() ,"Dashboard Title changed");
		Assert.assertTrue(dpObj.getDashboardURL() ,"Dashboard URL changed");
		

}}
