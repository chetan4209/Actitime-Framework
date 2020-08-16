package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_10 {
	@FindBy(xpath="//a[contains(text(),'View Time-Track')]")
	private WebElement ViewTimeTrack;
	@FindBy(xpath="//div[contains(text(),'Filters')]")
	private WebElement Filters;
	@FindBy(xpath="//span[contains(@class,'hierarchySelectorButton')]")
	private WebElement CustProjectDD;
	@FindBy(xpath="//div[@class='x-form-radio-wrap']//img[@class='x-form-radio']")
	private WebElement RadioButton;
	@FindBy(xpath="//div[contains(@class,'x-btn at-flat-button resetButton')]//a")
	private WebElement Reset;
	@FindBy(xpath="//div[contains(@class,'x-btn greyButton close-button')]")
	private WebElement Close;
	//@FindBy(xpath="//label[contains(text(),'Ready for Approval')]")
	//private WebElement ReadyForAppr;
	@FindBy(xpath="//label[contains(text(),'Not Ready and Rejected')]")
	private WebElement NotReady;
	@FindBy(xpath="//input[@class='showApproved']")
	private WebElement AproveB;
	@FindBy(xpath="//input[@class='applyFilterEdit']")
	private WebElement Apply;
	
	
	public TC_10(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ViewTimeTrackClick() {
		ViewTimeTrack.click();
	}
	public void FiltersClick() {
		Filters.click();
	}
	public void CustProjectDDClick() {
		CustProjectDD.click();
	}
	public void RadioButtonClick() {
		RadioButton.click();
	}
	public void ResetClick() {
		Reset.click();
	}
	public void CloseClick() {
		Close.click();
	}
	public void NotReadyClick() {
		NotReady.click();
	}
	public void AproveBClick() {
		AproveB.click();
	}
	
	public void ApplyClick() {
		Apply.click();
	}
	


}
