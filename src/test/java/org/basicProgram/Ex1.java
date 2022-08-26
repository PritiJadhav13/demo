package org.basicProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex1 {
	//String path = System.getProperty("user.dir");r
	public static void main(String[] args) {
		//String path = System.getProperty("user.dir");
		//System.out.println("path : "+path);
		Ex1 obj = new Ex1();
		obj.openchromeBrowser();
		obj.openfirefoxBrowser();
		obj.openmsedgeBrowser();

	}
	public void openchromeBrowser() {
		//System.setProperty("","D:\\Maven\\OM\\driver\\chromedriver.exe");      //chrome
		//System.setProperty("",path+"\\driver\\chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver","D:\\maven\\OM\\driver/chromedriver.exe");
	ChromeDriver obj = new ChromeDriver();     //opensbrowser
}
	public void openfirefoxBrowser() {
		//System.setProperty("","D:\\Maven\\OM\\driver\\geckodriver.exe");      //firefox
		//System.setProperty("",path+"\\driver\\geckodriver.exe"); 
		System.setProperty("webdriver.gecko.driver","D:\\Maven\\OM\\driver\\geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();
	}

	public void openmsedgeBrowser() {
		//System.setProperty("","D:\\Maven\\OM\\driver\\msedgedriver.exe");    //edge
		//System.setProperty("",path+"\\driver\\msedgedriver.exe"); 
		System.setProperty("webdriver.edge.driver","D:\\Maven\\OM\\driver/msedgedriver.exe"); 
		EdgeDriver obj = new EdgeDriver();
	}

}

