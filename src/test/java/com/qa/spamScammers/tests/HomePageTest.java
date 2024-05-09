package com.qa.spamScammers.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.spamScammers.pages.HomePage;
import com.qa.spamScammers.pages.LoginPage;

public class HomePageTest extends BaseTest{

	@Test(priority=1)
	public void verifyHomePageTitle() {
		page.getInstance(LoginPage.class).doLogin("byebye@scammer.com", "DoSomethingGoodInstead");
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();

		page.getInstance(HomePage.class).doClearForm();
		page.getInstance(HomePage.class).doSubmit("adieu", "adieu", "adieu", "adieu", "adieu", "adieu", "5555555555", "4111111111111111", "0101", "010");

		Assert.assertEquals(title, "My account");
		
	}
	
}
