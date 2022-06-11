package com.Shanon.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.CreateLeadPage;
import com.Shanon.pages.HomePage;
import com.Shanon.pages.LeadCustomViewPage;

@Listeners(com.Shanon.GenericLib.MyListeners.class)
public class VerifyLeadCreation extends BaseTest{

	@Test
	public void createNewLeadTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
		
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		LeadCustomViewPage lp=new LeadCustomViewPage();
		wlib.elementDisplayed(lp.getLeadsTextAddress(), "LEADS TEXT");
		
		LeadCustomViewPage lcvp=new LeadCustomViewPage();
		lcvp.clickNewLeadButton();
		FileLib flib=new FileLib();
		wlib.verifyPage(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "createLeadTitle"),
				"CREATE LEAD PAGE");
		
		
		CreateLeadPage clp=new CreateLeadPage();
		String salText = flib.readExcelData(EXCEL_PATH, "Leads", 0, 1);
		String firstName = flib.readExcelData(EXCEL_PATH, "Leads", 1, 1);
		String lastName = flib.readExcelData(EXCEL_PATH, "Leads", 2, 1);
		String company = flib.readExcelData(EXCEL_PATH, "Leads", 3, 1);
		
		clp.createLead(salText, firstName, lastName, company);
		
		
	}
}










