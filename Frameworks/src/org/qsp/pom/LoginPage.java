package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBTN;
	@FindBy(xpath = "//a[@id='toPasswordRecoveryPageLink']")
	private WebElement forgetPassword;
	@FindBy(xpath = "//a[contains(.,'actiTIME Inc.')]")
	private WebElement actitimeINC;
	@FindBy(id = "keepLoggedInLabel")
	private WebElement keepLoggedInLable;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


public void username(String un) {
	unTB.sendKeys(un);
}
public void setpassword(String pw) {
	pwTB.sendKeys(pw);
}
public void loginButton() {
	loginBTN.click();
}
public void clickForgetPassword() {
	forgetPassword.click();
}
public void clickActitimeINC() {
	actitimeINC.click();
}
}	
	
	
	


