package org.POM_TestCases;



import org.POM_Pages.DashboardPage;
import org.POM_Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class LoginTestCase {
	@Test
	public void ValidateLoginPageTC001() {
		BaseUtility bu = new BaseUtility(); 
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		
		LoginPage lpObj = new LoginPage(driver);
		Assert.assertTrue(lpObj.isUserNameFieldDisplayed(), "User Name Field is not displayed");
		Assert.assertTrue(lpObj.isPasswordFiNameDisplayed(), "Password Field is not displayed");
		Assert.assertTrue(lpObj.isloginBtnDisplayed(), "login Button Field is not displayed");
		Assert.assertTrue(lpObj.keepMeLoginCheckBoxDisplayed(), "Keep Me Login CheckBox  not displayed");
		Assert.assertTrue(lpObj.isloginLogosDisplayed(), "Activetime Logos is not displayed");
        driver.close();
//		WebElement uNameField =driver.findElement(By.id("username"));
//		Assert.assertTrue(uNameField.isDisplayed(), "User Name Field is not displayed");
//
//		WebElement pwdField =driver.findElement(By.cssSelector(".textField.pwdfield"));
//		Assert.assertTrue(pwdField.isDisplayed(), "Password Field is not displayed");
//
//		WebElement loginBtn =driver.findElement(By.cssSelector("#loginbutton>div"));
//		Assert.assertTrue(loginBtn.isDisplayed(), "login Button Field is not displayed");
//
//		WebElement KeepMeLoginCheckBox =driver.findElement(By.cssSelector("keepLoggedinCheckBox"));
//		Assert.assertTrue(KeepMeLoginCheckBox.isDisplayed(), "Keep Me Login CheckBox  not displayed");
//
//		List<WebElement> loginLogos = (List<WebElement>) driver.findElement(By.cssSelector("#logoContainer log"));
//		Assert.assertTrue(loginLogos.get(0).isDisplayed(), "Activetime Logos is not displayed");
//		Assert.assertTrue(loginLogos.get(1).isDisplayed(), "Activetime Logos is not displayed");
	}


	public void ValidateLoginFunctionality() {
		BaseUtility bu = new BaseUtility(); 
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		
		LoginPage lpObj = new LoginPage(driver);
		lpObj.enterPassword("admin");
		lpObj.enterPassword("manager");
		lpObj.ClickOnLoginBtn();
		
		
		//lpObj.doLogin("admin", "manager");
		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
//		driver.findElement(By.cssSelector("#loginbutton>div")).click();
		bu.waitForVisibilityofWebElementByType(driver,10,"id","logoutLink");
		
		DashboardPage dpObj = new DashboardPage(driver);
		Assert.assertTrue(dpObj.getDashboardTitle() ,"Dashboard Title changed");
		Assert.assertTrue(dpObj.getDashboardURL() ,"Dashboard URL changed");
		driver.close();
		
		
		
		
		
	}}