package com.qa.contentstack.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.contentstack.base.TestBase;

/**
 * @author nikhilk
 *
 */
public class LoginPage extends TestBase {
	
	
//below are the loginPage all Ui fields with thee locators.
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement loginBtn;
	
    @FindBy(id="email")
	WebElement emailTextField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement forgotPasswordlink;
	
	@FindBy(xpath="//a[contains(text(),'Login via SSO')]")
	WebElement loginViaSSO;
	
	@FindBy(id="sso_id")
     WebElement SSONameTextField;	
	
	@FindBy(id="ss_btn")
	WebElement ssContinueBtn;
	
	
	
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	
	
	//Methods acting upon code will start from here
	public String getTitle() {
		return driver.getTitle();
	}
	
	//this method is used to login Login using Contentstack credentials
	public void login(String emailId,String password) {
		loginBtn.click();
		
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		//String Pagetitle = driver.getTitle();
		 emailTextField.sendKeys(emailId);
			passwordField.sendKeys(password);
			loginButton.click();
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("test");
	   
	}
	
	public void forgotPassword() {
		loginBtn.click();
		
	}
	
}
