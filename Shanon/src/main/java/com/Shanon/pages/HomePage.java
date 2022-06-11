package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement accountsTab;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadsTab() {
		return leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
	
	
	public void clickAccountsTab() {
		accountsTab.click();
	}
	
}
