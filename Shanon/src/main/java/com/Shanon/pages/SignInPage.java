package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class SignInPage {

	@FindBy(id="userName") private WebElement loginName;
	@FindBy(id="passWord") private WebElement password;
	@FindBy(xpath = "//input[@title='Sign In']") private WebElement signInButton;
	
	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLoginName() {
		return loginName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	public void typeLoginName(String un)
	{
		loginName.sendKeys(un);
	}
	
	public void typePassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	public void signIn(String un, String pw)
	{
		loginName.sendKeys(un);
		password.sendKeys(pw);
		signInButton.click();
	}
	
	
}
