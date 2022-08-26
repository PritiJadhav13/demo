package org.basicProgram;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.utility.BaseUtility;

import com.google.common.base.Function;

public class ImplicitExplicitWaitEx2 {

	public static void main(String[] args) {
		System.out.println("** PROGRAM START **");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.StartUp("ch", url);


		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//Thred.sleep(5000);
		//WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wt.until(ExpectedCondition.visibilityof(driver.findElement(By.id("logoutLink"))));
		
		bu.waitForVisibilityofWebElementByType(driver,10,"id","logoutLink");
        
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring((NoSuchElementException.class));
		
		WebElement logout = wt.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("logoutLink"));
			}
		});
		logout.clear();
		System.out.println("** PROGRAM ENDS **");

	}

}
