package org.TestNG;

import org.testng.annotations.Test;

public class Ex3 {
  @Test
  public void Test1() {
	  System.out.println("Test1");  
	  Test2();
	  System.out.println("Test End");
  }
  @Test
public void Test2() {
	System.out.println("Test2");
}
  @Test
public void Test3() {
	System.out.println("Test3");
}

}
