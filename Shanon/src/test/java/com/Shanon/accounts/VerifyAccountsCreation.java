package com.Shanon.accounts;

import java.util.Set;

import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.AccountsCustomViewPage;
import com.Shanon.pages.CreateAccountsPage;
import com.Shanon.pages.HomePage;

public class VerifyAccountsCreation extends BaseTest{

	@Test
	public void createAccountTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		AccountsCustomViewPage acvp=new AccountsCustomViewPage();
		acvp.clickNewAccountButton();
		
		CreateAccountsPage cap=new CreateAccountsPage();
		cap.clickAccountNameButton();
		
		//WebdriverCommonLib wlib=new WebdriverCommonLib();
		//String parentTitle = wlib.getPageTitle();
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title = driver.switchTo().window(wh).getTitle();
			FileLib flib=new FileLib();
			String acTitle = flib.readPropertyData(PROP_PATH, "accountNameTitle");
			if(title.contains(acTitle))
			{
				Thread.sleep(2000);
				cap.clickAccountName();
				break;
			}
			
		}
		driver.switchTo().window(parentWindowHandle);
		
	}
}







