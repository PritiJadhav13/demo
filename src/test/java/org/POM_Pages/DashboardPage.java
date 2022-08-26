package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	//WebElement
	private WebDriver driver;
	
	//Constructor
	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//Page action Method
	public boolean getDashboardTitle() {
	return(driver.getTitle().equals("activeTime - Enter Time-Track"));
	}
	public boolean getDashboardURL() {
		return(driver.getTitle().equals("http://localhost/user/submit_tt.do"));


}}