package org.basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class FindElementsEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);
   
		List<WebElement> credFields = (List<WebElement>) driver.findElement(By.cssSelector("td[Valign='middle']>input[placeholder]"));
		
		WebElement userNameField = credFields.get(0);
		WebElement passeordField = credFields.get(1);
		userNameField.sendKeys("admin");
	    passeordField.sendKeys("manager");
		 
	    credFields.get(0).sendKeys("admin"); 
	    credFields.get(1).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Thread.sleep(2000);
		List<WebElement> errList = driver.findElements(By.cssSelector("#ErrorsTable .errormsg"));
		System.out.print("List empty ? : "+errList.isEmpty());
	    
		if(errList.isEmpty()) {
			System.out.print("Error message not displayed.");
	   	}else {
	    		System.out.print("Error message is displayed.");
	    	}
		System.out.print("** PROGRAM ENDS **");
	}
}

//Try{
//	 driver.findElements(By.cssSelector("#ErrorsTable .errormsg"));
//		System.out.print("Error message is displayed.");
//}catch(Exception e){
//		System.out.print("Error message not displayed.");






