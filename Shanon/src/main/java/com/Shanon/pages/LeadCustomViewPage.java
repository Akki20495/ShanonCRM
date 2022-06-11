package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class LeadCustomViewPage {

	@FindBy(xpath = "//td[contains(text(),'Leads: ')]") private WebElement leadsText;
	@FindBy(xpath = "//input[@value='New Lead']") private WebElement newLeadButton;
	
	public void clickNewLeadButton()
	{
		newLeadButton.click();
	}
	
	
	public LeadCustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadsTextAddress() {
		return leadsText;
	}
	
	public String getLeadsText()
	{
		return leadsText.getText();
	}
	
	
}
