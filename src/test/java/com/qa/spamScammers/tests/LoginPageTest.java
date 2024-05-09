package com.qa.spamScammers.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.spamScammers.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	@Test(priority=1)
	public void verifyLoginPageTitle() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login page title is: "+title);
		Assert.assertEquals(title, "My account");
	}
}
