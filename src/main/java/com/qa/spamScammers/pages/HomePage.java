package com.qa.spamScammers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators
	
	By fnm = By.xpath("//*[@id='fnm']");
	By adr = By.xpath("//*[@id='adr']");
	By zip = By.xpath("//*[@id='zip']");
	By cty = By.xpath("//*[@id='cty']");
	By stt = By.xpath("//*[@id='stt']");
	By cnt = By.xpath("//*[@id='cnt']");
	By phn = By.xpath("//*[@id='phn']");
	By cnm = By.xpath("//*[@id='cnm']");
	By exp = By.xpath("//*[@id='exp']");
	By csc = By.xpath("//*[@id='csc']");
	By SubmitBtn = By.xpath("//*[@id='bt_submit']");

	
	//page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageHeader() {
		//return doGetText(header);
		return "fake header";
	}
	
	public void doSubmit(String FirstName, String Address, String PostalCode, String City, String Street, String Country, String Phone, String CardNumber, String Expiry, String CVN) {
		doSendKeys(fnm, FirstName);
		doSendKeys(adr, Address);
		doSendKeys(zip, PostalCode);
		doSendKeys(cty, City);
		doSendKeys(stt, Street);
		doSendKeys(cnt, Country);
		doSendKeys(phn, Phone);
		doSendKeys(cnm, CardNumber);
		doSendKeys(exp, Expiry);
		doSendKeys(csc, CVN);
		doClick(SubmitBtn);
	}

	public void doClearForm() {
		doClearField(fnm);
		doClearField(adr);
		doClearField(zip);
		doClearField(cty);
		doClearField(stt);
		doClearField(cnt);
		doClearField(phn);
		doClearField(cnm);
		doClearField(exp);
		doClearField(csc);
	}
}
