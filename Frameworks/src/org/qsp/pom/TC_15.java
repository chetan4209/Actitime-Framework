package org.qsp.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_15 {
	@FindBy(xpath="//div[contains(@class,'task')][contains(text(),'NASA negotiations')]")
	private WebElement Task;
	@FindBy(xpath="//span[contains(text(),'MANAGERS (8)')]")
	private WebElement Manager;
	@FindBy(xpath="//div[contains(text(),'Add Managers')]")
	private WebElement AddMgr;
	@FindBy(xpath="//span[contains(text(),'Nowak, Peter')]")
	private WebElement Username;
	@FindBy(xpath="//div[contains(@class,'selector-panel user-selector-panel assignedUserSelector withPermissionIcons x-table-layout-ct')]//table[contains(@class,'x-table-layout')]//tbody//tr//td[contains(@class,'x-table-layout-cell footer')]//div//div[contains(@class,'x-btn greyButton close-button')]")
	private WebElement Close;
	
	public TC_15(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void TaskClick() {
		Task.click();
	}
	public void mouseOver(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(Manager).build().perform();
	}
	public void ManagerClick() {
		Manager.click();
	}
	public void AddMgrClick() {
		AddMgr.click();
	}
	public void UserNameClick() {
		Username.click();
	}
	public void Scrollup(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Close);
		}
	public void Scrollupclick(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Close);
		}

	

}
