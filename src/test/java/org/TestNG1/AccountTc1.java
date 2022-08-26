package org.TestNG1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class AccountTc1 {
	@BeforeClass
	public void initAccountTestData() {
		System.out.println("Read Account Test Data");
	}
	@AfterClass
	public void clearAccountTestData() {
		System.out.println("clear Account Test Data");
	}
	@Test
	public void creatAccount() {
		System.out.println("Creat Account");
	}

	@Test
	public void updateAccount() {
		System.out.println("Update Account");
	}

	@Test
	public void deleteAccount() {
		System.out.println("Delete Account");


	}}

