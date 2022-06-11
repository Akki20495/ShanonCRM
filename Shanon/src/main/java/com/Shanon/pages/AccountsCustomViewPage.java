package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class AccountsCustomViewPage {

	
	@FindBy(xpath = "//input[@value='New Account']") private WebElement newAccountButton;
	
	public AccountsCustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickNewAccountButton()
	{
		newAccountButton.click();
	}
}
