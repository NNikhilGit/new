package com.qa.contentstack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.contentstack.base.TestBase;

public class ContactUsPage extends TestBase{

	@FindBy(name = "FirstName")
	WebElement firstNameTextField;

	@FindBy(name = "LastName")
	WebElement lastNameTextField;

	@FindBy(name = "Email")
	WebElement workEmailField;

	@FindBy(name = "Company")
	WebElement companyName;

	@FindBy(name = "Phone")
	WebElement phoneNoField;

	@FindBy(xpath = "//select[@id=\"Title\"]")
	WebElement selectYourTitleDrpdown;

	@FindBy(id = "Contact_Us_Subject__c")
	WebElement selectYourIntrestDrpdown;

	@FindBy(name = "jobPosition")
	WebElement selectJobRoleDrpdown;

	@FindBy(id = "Contact_Us__c")
	WebElement commentBox;

	@FindBy(id = "Opt_In_Confirmation__c")
	WebElement subscribeCheckBox;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submitBtn;

	
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	/**
	 * @param fName
	 * @param lName
	 * @param workEmail
	 * @param comapnyName
	 * @param phoneNo
	 * @param titleName
	 * @param intrestName
	 * @param jobRole
	 * @param comment
	 */
	public void contactUs(String fName, String lName, String workEmail, String compName, String phoneNo,
			String titleName, String intrestName, String jobRole, String comment) {
		firstNameTextField.sendKeys(fName);
		lastNameTextField.sendKeys(lName);
		workEmailField.sendKeys(workEmail);
		companyName.sendKeys(compName);
		phoneNoField.sendKeys(phoneNo);
		//
		Select titleDropdown = new Select(selectYourTitleDrpdown);
		titleDropdown.selectByValue(titleName);

		Select intrestDropdown = new Select(selectYourIntrestDrpdown);
		intrestDropdown.selectByValue(intrestName);

		Select jobRoleDropdown = new Select(selectJobRoleDrpdown);
		jobRoleDropdown.selectByValue(jobRole);

		commentBox.sendKeys(comment);
		subscribeCheckBox.click();
		submitBtn.click();

	}

}
