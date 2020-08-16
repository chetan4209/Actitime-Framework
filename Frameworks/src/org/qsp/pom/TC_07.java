package org.qsp.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_07 {
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
	@FindBy(xpath="//div/span[contains(.,'Customer7')]")
	private WebElement ViewTask;
	@FindBy(xpath="//div[contains(text(),'ACTIONS')]")
	private WebElement Actions;
	@FindBy(xpath="//div[contains(text(),'Copy to')]")
	private WebElement CopyTo;
	@FindBy(xpath="//div[contains(text(),'- Select Customer -')]")
	private WebElement SelCust;
	@FindBy(xpath="//div[contains(text(),'Select target project to copy task to:')]/following::div[contains(text(),'Galaxy Corporation')]")
	private WebElement SelComp;
	@FindBy(xpath="//body[contains(@class,'ext-chrome')]/div[contains(@class,'edit_task_sliding_panel sliding_panel components_panelContainer')]/div[contains(@class,'content_panelContainer')]/div[contains(@class,'loadingContainer')]/div[contains(@class,'content')]/div[contains(@class,'taskPanelContent')]/div[contains(@class,'contentScrollableWrapper')]/div[contains(@class,'taskPanelInnerContent')]/div[5]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement SelProject;
	@FindBy(xpath="//div[contains(text(),'Android prototyping')]")
	private WebElement androidp;
	@FindBy(xpath="//div[contains(@class,'ok button')][contains(text(),'Copy')]")
	private WebElement Copy;

	
	public TC_07(WebDriver driver) {
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
		CusName.sendKeys("Customer7");
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
	public void ViewTaskClick() {
		ViewTask.click();
		}
	public void ActionsClick() {
		Actions.click();
		}
	public void CopyToClick() {
		CopyTo.click();
		}
	public void SelCustClick() {
		SelCust.click();
		}
	public void SelCompClick() {
		SelComp.click();
		}
	public void SelProjectClick() {
		SelProject.click();
		}
	public void androidpClick() {
		androidp.click();
		}
	public void ScrolltoCopy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Copy);
		}
	public void ScrollCopyclick(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Copy);
		}
	
		}
	
	
		
	



