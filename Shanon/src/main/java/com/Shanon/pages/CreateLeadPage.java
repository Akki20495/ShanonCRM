package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.WebdriverCommonLib;

public class CreateLeadPage {

	@FindBy(name="property(First Name)") private WebElement firstNameTextbox;
	@FindBy(name="property(Company)") private WebElement companyTextbox;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextbox;
	@FindBy(xpath = "(//input[@value='Save'])[1]") private WebElement saveButton;
	
	@FindBy(name="property(saltName)") private WebElement salutationDropdown;
	
	public CreateLeadPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNameTextbox() {
		return firstNameTextbox;
	}

	public WebElement getCompanyTextbox() {
		return companyTextbox;
	}

	public WebElement getLastNameTextbox() {
		return lastNameTextbox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSalutationDropdown() {
		return salutationDropdown;
	}
	
	
	public void createLead(String salText, String firstname, String lastname, String company)
	{
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		wlib.selectOption(salutationDropdown, salText);
		firstNameTextbox.sendKeys(firstname);
		lastNameTextbox.sendKeys(lastname);
		companyTextbox.sendKeys(company);
		saveButton.click();
	}
	
	
	
	
	
	
	
	
	
}
