package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.contenstack.utility.TestUtil;
import com.qa.contentstack.base.TestBase;
import com.qa.contentstack.pages.LoginPage;

public class AllTestCases extends TestBase {
	
	LoginPage loginPage;
	TestUtil testUtil;

	public AllTestCases() {

		super();
	}
	@BeforeMethod
	public void setup() {

		intialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();

	}
	
	@Test
	public void loginTestcase() {
		
		loginPage.login("nikhil.kale@bnt-soft.com", "passsword");
		
	}
	
	
}
