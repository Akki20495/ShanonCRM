package com.Shanon.login;

import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.pages.SignInPage;
//Open browser
public class ValidLogin extends BaseTest{


	public void loginToApp() 
	{
		//Login to app
		SignInPage sp=new SignInPage();
		FileLib flib=new FileLib();
		String un = null;
		try {
			un = flib.readPropertyData(PROP_PATH, "username");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String pw = null;
		try {
			pw = flib.readPropertyData(PROP_PATH, "password");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		sp.signIn(un, pw);
		
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		try {
			wlib.verifyPage(wlib.getPageTitle(),
					flib.readPropertyData(PROP_PATH, "homeTitle"),
					"CRM HOME PAGE");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
//Close Browser
