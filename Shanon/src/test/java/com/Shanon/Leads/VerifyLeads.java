package com.Shanon.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.HomePage;
import com.Shanon.pages.LeadCustomViewPage;

@Listeners(com.Shanon.GenericLib.MyListeners.class)
public class VerifyLeads  extends BaseTest{

	@Test
	public void verifyLeadsTabTest() 
	{
		//Login and verify Home Page
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		//Click on Leads 
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
		
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		LeadCustomViewPage lp=new LeadCustomViewPage();
		wlib.elementDisplayed(lp.getLeadsTextAddress(), "LEADS TEXT");
		
		
		
		
		
		
		
		
		
	}
}
