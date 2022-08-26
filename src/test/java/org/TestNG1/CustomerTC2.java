package org.TestNG1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerTC2 {
	@BeforeTest
	public void getDevEnvironmentDetails() {
		System.out.println("Read Dev Environment Details");
	}
	@AfterTest
	public void clearDevEnvironmentDetails() {
		System.out.println("clear Dev Details");
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
