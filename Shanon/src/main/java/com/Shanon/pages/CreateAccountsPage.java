package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class CreateAccountsPage {

	@FindBy(xpath = "//img[@title='Account Name Lookup']") private WebElement accountNameButton;
	@FindBy(xpath = "//a[text()='QSpiders Bull Temple']") private WebElement accountName;
	
	public CreateAccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickAccountNameButton()
	{
		accountNameButton.click();
	}

public WebElement getAccountName()
{
return accountName;	
}

public void clickAccountName()
{
	accountName.click();
	}







}
