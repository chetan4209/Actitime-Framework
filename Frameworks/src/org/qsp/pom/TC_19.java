package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_19 {
	@FindBy(xpath="//span[contains(@class,'dashedLink')][contains(text(),'Me')]")
	private WebElement Me;
	@FindBy(xpath="//span[contains(@class,'userName')][contains(text(),'Nowak, Peter')]")
	private WebElement Username;
	
	public TC_19(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void MeClick() {
		Me.click();
	}
	public void UsernameClick() {
		Username.click();
	}
	
	
}
