package com.qa.spamScammers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//page locators
	By emailId = By.xpath("//*[@id=\"eml\"]");
	By password = By.id("pss");
	By loginBtn = By.xpath("/html/body/main/div/div[3]/div/div[1]/form/button");
	
	//page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void doLogin(String username, String pwd) {
		doSendKeys(emailId, username);
		doSendKeys(password, pwd);
		doClick(loginBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
