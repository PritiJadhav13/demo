package org.TestNG;

import org.testng.annotations.Test;

public class ExecutionSequenceEx1 {
  @Test
  public void login() {
	  System.out.println("Login");
  }
@Test
public void logout() {
	System.out.println("Logout");
}
@Test
public void creatCustomer() {
	System.out.println("small creat Customer ");
}
@Test
public void CreatCustomer() {
	System.out.println("Capital Creat Customer ");
}
@Test
public void updateCustomer() {
	System.out.println(" Small update Customer ");
	
}
@Test
public void UpdateCustomer() {
	System.out.println("Capital Update Customer");
}
@Test
public void deleteCustomer() {
	System.out.println("Small delete Customer");
}
@Test
public void DeleteCustomer() {
	System.out.println("Capital Delete Customer");
}
}
