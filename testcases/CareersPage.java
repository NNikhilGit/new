package com.qa.contentstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.contentstack.base.TestBase;

public class CareersPage extends TestBase {

@FindBy(xpath="")
WebElement  test;

@FindBy(xpath="//a[contains(text(),'Apply Now')]")
WebElement applyNowBtn;

@FindBy(xpath="//input[@type=\"text\" and @id=\"c-0-8\"]")
WebElement firstNameField;

@FindBy(xpath="//input[@type=\"text\" and @id=\"c-1-8\"]")
WebElement lastNameField;

@FindBy(xpath="//input[@type=\"text\" and @id=\"c-3-7\"]")
WebElement emailField;

@FindBy(xpath="//select[@id=\"c-4-6\"]")
WebElement jobPositionDropDown;

@FindBy(id="c-5-5")
WebElement commnetBox;



public CareersPage() {
	PageFactory.initElements(driver, this);
	
}




public void selectJobTobeApply(String jobName){
	
	driver.findElement(By.xpath("//h3[contains(text(),\'"+jobName+"')]")).click();
}
}
