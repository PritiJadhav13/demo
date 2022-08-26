package org.basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex2 {
	
	public static void main(String[] args) { 
		String bName= "ch";
		WebDriver driver = null;
	if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
		//System.setProperty("","D:\\Maven\\OM\\driver\\chromedriver.exe");      //chrome
		//System.setProperty("",path+"\\driver\\chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver","D:\\maven\\OM\\driver/chromedriver.exe");
	    //ChromeDriver objch = new ChromeDriver();     //opensbrowser
	  //  WebDriver driver = new ChromeDriver(); 
		driver = new ChromeDriver();
	    //  objch.manage().window().maximize(); 
	    //  objch.manage().window().minimize();         //selenium or onwords
      // objch.manage().window().setsize(new Dimension(350,300)); 
	
	}else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
         //System.setProperty("","D:\\Maven\\OM\\driver\\geckodriver.exe");      //firefox
		//System.setProperty("",path+"\\driver\\geckodriver.exe"); 
		System.setProperty("webdriver.gecko.driver","D:\\Maven\\OM\\driver\\geckodriver.exe");
		//FirefoxDriver objff = new FirefoxDriver();
	//	WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		//objff.manage().window().maximize();
		 //  objff.manage().window().minimize();
		   // objff.manage().window().setsize(new Dimension(350,300)); 
	
	}else if(bName.equalsIgnoreCase("edge") ) {
		//System.setProperty("","D:\\Maven\\OM\\driver\\msedgedriver.exe");    //edge
		//System.setProperty("",path+"\\driver\\msedgedriver.exe"); 
		System.setProperty("webdriver.edge.driver","D:\\Maven\\OM\\driver\\msedgedriver.exe"); 
	//	EdgeDriver objEdge = new EdgeDriver();
	//	WebDriver driver = new EdgeDriver();
		driver = new EdgeDriver();
		 //  objEdge.manage().window().maximize(); 
		 //  objEdge.manage().window().minimize(); 
		   // objEdge.manage().window().setsize(new Dimension(350,300)); 
		
	}else {
		System.out.println("Invalid Browser Name");
	}
	driver.manage().window().maximize();
	
	
	}

}