package org.TestNG1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTC1 {
	@BeforeClass
	public void initCustomerTestData() {
		System.out.println("Read customer Test Data");
	}
	@AfterClass
	public void clearCustomerTestData() {
		System.out.println("clear customer Test Data");
	}
  @Test
  public void creatCustomer() {
	  System.out.println("Creat Customer");
  }

  @Test
  public void updateCustomer() {
	  System.out.println("Update Customer");
  }

  @Test
  public void deleteCustomer() {
	  System.out.println("Delete Customer");


}}
