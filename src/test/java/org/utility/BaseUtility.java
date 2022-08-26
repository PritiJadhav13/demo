package org.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	public void waitForVisibilityElement(WebDriver driver, int time, WebElement ele) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
   public void waitForVisibilityofWebElementByType(WebDriver driver, int time, String locType, String locator) {
	   WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
	   switch(locType){
	   case "id": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
	             break;
	   case "Xpath": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
                 break;
	   case "css": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator))));
                 break;
	   case "class": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(locator))));
                 break;

	   }
   }
   public void waitForInvisibilityElement(WebDriver driver, int time, WebElement ele) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
  public void waitForInvisibilityofWebElementByType(WebDriver driver, int time, String locType, String locator) {
	   WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
	   switch(locType){
	   case "id": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
	             break;
	   case "Xpath": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
                 break;
	   case "css": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator))));
                 break;
	   case "class": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(locator))));
                 break;
	   }
  }
	public WebDriver StartUp(String bName, String url) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\maven\\OM\\driver\\chromedriver.exe");
			//chromeOptions = new chromeOption();
			//options.addArguments("start-maximized");
			//driver = new chromeDriver(options);
			driver = new ChromeDriver();    //open Browser
		}else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Maven\\OM\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(bName.equalsIgnoreCase("edge") ) {
			System.setProperty("webdriver.edge.driver","D:\\Maven\\OM\\driver\\msedgedriver.exe"); 
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Name");
		}
		driver.manage().window().maximize();
	//	driver.manage().window().minimize();                     //selenium 4 onwards
	//	driver.manage().window().setSize(new Dimension(350,300));
	// upto selenium 3 
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.Seconds(10));
   // selenium 4 onwords
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
        return driver;
	}
  // public int addition(int a, int b) {
   //int sum = a+b;
  // return sum;

	public void scrollByJs(WebDriver driver, WebElement selValueDDL) {
		// TODO Auto-generated method stub
		
	}
}
