package org.TestNG2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class ParalleMethodsEx2Test {
  @Test
		public void googleCH() {
			System.out.println("** Ex2 Chrome START **");
			BaseUtility bu = new BaseUtility();
			String url = "http://www.google.com";
			WebDriver driver = bu.StartUp("ch", url);
			driver.close();
			System.out.println("** Ex2 Chrome  ENDS **");
		}
		@Test
		public void facebookEdge() {
			System.out.println("**  Ex2 Edge START **");
			BaseUtility bu = new BaseUtility();
			String url = "http://www.facebook.com";
			WebDriver driver = bu.StartUp("edge", url);
			driver.close();
			System.out.println("** Ex2 Edge ENDS **");
		}}



