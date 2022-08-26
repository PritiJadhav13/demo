package org.TestNG;

import org.testng.annotations.Test;

public class PriorityEx1 {
  @Test (priority=6)
  public void login() {
	  System.out.println("Login");
  }
@Test (priority=5)
public void logout() {
	System.out.println("Logout");
}
@Test (priority=3)
public void creatCustomer() {
	System.out.println("small creat Customer ");
}
@Test (priority=4)
public void CreatCustomer() {
	System.out.println("Capital Creat Customer ");
}
@Test (priority=1)
public void updateCustomer() {
	System.out.println(" Small update Customer ");
	
}
@Test (priority=2)
public void UpdateCustomer() {
	System.out.println("Capital Update Customer");
}
@Test (priority=7)
public void deleteCustomer() {
	System.out.println("Small delete Customer");
}
@Test (priority=8)
public void DeleteCustomer() {
	System.out.println("Capital Delete Customer");
}
}

