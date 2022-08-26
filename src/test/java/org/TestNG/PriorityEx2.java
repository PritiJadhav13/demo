package org.TestNG;

import org.testng.annotations.Test;

public class PriorityEx2 {
  @Test(priority=-11)
  public void login() {
	  System.out.println("login");
  }
  @Test(priority=80)
public void logout() {
	System.out.println("logout");
}
  @Test(priority=4)
public void updateCustomer() {
	System.out.println("small update Customer");
}
  @Test(priority=5)
public void UpdateCustomer() {
System.out.println("Capital Update Customer");	
}
  @Test(priority=5)
public void creatCustomer() {
System.out.println("Small creat Customer");	
}
  @Test(priority=6)
public void CreatCustomer() {
System.out.println("capital Creat Customer");	
}
  @Test(priority=7)
public void deletCustomer() {
System.out.println("Small delete Customer");	
}
  @Test(priority=7)
public void DeleteCustomer() {
System.out.println("capital Delete Customer");	

}
}