package org.GenericMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GenericMethod {
	public WebDriver startUp(String bName , String url) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.get(url);
		}
		return driver;
	}
}