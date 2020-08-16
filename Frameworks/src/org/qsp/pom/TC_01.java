package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_01 {
	@FindBy(xpath="//div[@class='addTasksImg']")
	private WebElement addNew;
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement ddButton;
	@FindBy(xpath="//div[contains(text(),'- New Customer -')]")
	private WebElement NewCus;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement CusName;
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement ProjName;
	@FindBy(xpath="//div[@class='tablePlaceholder']//tr[1]//td[1]//input[1]")
	private WebElement TaskName;
	@FindBy(xpath="//div[@id='createTasksPopup']//tr[1]//td[3]//input[1]")
	private WebElement Estimate;
	@FindBy(xpath="//button[@id='ext-gen34']")
	private WebElement DeadLine;
	@FindBy(xpath="//td[contains(@class,'x-date-activex-date-weekend x-date-weekend')]//span[contains(text(),'30')]")
	private WebElement Date;
	@FindBy(xpath="//div[contains(text(),'Create Tasks')]")
	private WebElement NewTask;
	
	
	public TC_01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void NewClick() {
		addNew.click();
	}
	public void mouseOver(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(ddButton).build().perform();
	}
	public void ddButtonClick() {
		ddButton.click();
	}
	public void NewCusClick() {
		NewCus.click();
	}
	public void NewCusName(String CName) {
		CusName.sendKeys(CName);
	}
	public void NewPName(String PName) {
		ProjName.sendKeys(PName);
	}
	public void NewTaskName(String TName) {
		TaskName.sendKeys(TName);
	}
	public void EstiName(String estimate) {
		Estimate.sendKeys(estimate);
	}
	public void DlineClick() {
		DeadLine.click();
	}
	public void DlineDateClick() {
		Date.click();
		}
	public void CreatTaskClick() {
		NewTask.click();
		}
	
}

