package org.qsp.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_14 {
	@FindBy(xpath="//div[contains(@class,'task')][contains(text(),'NASA negotiations')]")
	private WebElement Task;
	@FindBy(xpath="//div[@class='assignedUsers']")
	private WebElement AssUser;
	@FindBy(xpath="//div[contains(@class,'assignUserButton components_button withPlusIcon')][contains(text(),'Assign')]")
	private WebElement Assign;
	@FindBy(xpath="//span[contains(text(),'Smith, Brett')]")
	private WebElement UserName;
	@FindBy(xpath="//div[contains(@class,'x-btn greyButton close-button')]")
	private WebElement Close;
	
	public TC_14(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void TaskClick() {
		Task.click();
	}
	public void AssUserClick() {
		AssUser.click();
	}
	public void AssignClick() {
		Assign.click();
	}
	public void UserNameClick() {
		UserName.click();
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
