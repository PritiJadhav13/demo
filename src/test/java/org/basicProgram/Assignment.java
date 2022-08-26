package org.basicProgram;

import org.utility.BaseUtility;

public class Assignment {


	public static void main(String[] args) {
		
		System.out.println("** Program Starte **");
		BaseUtility bu = new BaseUtility();
		String url =("https://www.flipkart.com/");
		bu.StartUp("ch", url);
		
	
	//WebElement Search = driver.findElement(By.name("title=\"Search for products, brands and more\""));
	//Search.sendKeys("Samsung32");
       System.out.println("** Program End **");
	}

	}


