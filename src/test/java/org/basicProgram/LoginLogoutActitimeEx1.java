package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class LoginLogoutActitimeEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);

		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		 Thread.sleep(5000);
		
		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTime - Enter Time-Track";
		System.out.println("actDashTitle :"+actDashTitle);
		
		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("Login Successful.");
		}else {
			System.out.println("Unable to login.");
		}
      System.out.println("***************************");
      
      String actDashURL = driver.getCurrentUrl();
      String expDashURL = "http://localhost/user/submit_tt.do";
      if(actDashURL.equals(expDashURL)) {
			System.out.println("Dashboard url matched!!!!.");
		}else {
			System.out.println("Dashboard url  not matched!!!!.");
		
	}
 
    driver.findElement(By.id("logoutLink")).click();
    System.out.println("** PROGRAM ENDS **");


}
}
