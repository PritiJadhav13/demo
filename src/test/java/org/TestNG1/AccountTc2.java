package org.TestNG1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTc2 {
	@BeforeTest
	public void getQAEnvironmentDetails() {
		System.out.println("Read QA environment Details");
	}
	@AfterTest
	public void clearQAEnvironmentDetails() {
		System.out.println("clear QA Details");
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


