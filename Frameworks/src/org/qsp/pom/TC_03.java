package org.qsp.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_03 {
	@FindBy(xpath="//div[@class='addTasksImg']")
	private WebElement addNew;
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement ddButton;
	@FindBy(xpath="//div[contains(text(),'- New Customer -')]")
	private WebElement ScrollCust;
	
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
	/*@FindBy(xpath="//tr[@id='taskRow142']")
	private WebElement MouseoverTask;
	@FindBy(xpath="//tr[@xpath=\"1\"]")
	private WebElement HRow;*/
	@FindBy(xpath="//div[contains(.,'Task3')]/parent::div/descendant::div/span[contains(.,'Customer3')]")
	private WebElement ViewTask;
	@FindBy(xpath="//div[contains(text(),'ACTIONS')]")
	private WebElement Actions;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	private WebElement Delete;
	@FindBy(xpath="//span[contains(@class,'submitTitle buttonTitle')]")
	private WebElement DeletePerm;
	
	
	public TC_03(WebDriver driver) {
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
	public void Scrollup(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollCust);
		}
	public void Scrollupclick(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ScrollCust);
		}
	
	public void NewCusClick() {
		NewCus.click();
	}
	public void NewCusName() {
		CusName.sendKeys("Customer3");
	}
	public void NewPName() {
		ProjName.sendKeys("Project3");
	}
	public void NewTaskName() {
		TaskName.sendKeys("Task3");
	}
	public void EstiName() {
		Estimate.sendKeys("5");
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
	//public void mouseOver1(WebDriver driver) {
	//	Actions a = new Actions(driver);
		//a.moveToElement(MouseoverTask).build().perform();
		//}
	//public void HideRowClick() {
	//	HRow.click();
		//}
	public void ClickViewTask() {
		ViewTask.click();
		}
	public void ActionsClick() {
		Actions.click();
		}
	public void DeleteClick() {
		Delete.click();
		}
	public void DeletePClick() {
		DeletePerm.click();
		}

}
