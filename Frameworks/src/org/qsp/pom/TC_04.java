package org.qsp.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_04 {
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
	@FindBy(xpath="//div[@class='title dashedLink']")
	private WebElement CopyProp;
	@FindBy(xpath="//div[@class='addTasksSelectorPanelContent']//div//td[@class='dropdownButton']")
	private WebElement ddButton2;
	@FindBy(xpath="//td[contains(text(),'Big Bang Company')]")
	private WebElement BBC;
	@FindBy(xpath="//span[contains(text(),'Flight analysis')]")
	private WebElement Checkbox;
	@FindBy(xpath="//span[contains(@class,'buttonImportTitle')]")
	private WebElement CopyProperties;
	
	
	public TC_04(WebDriver driver) {
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
		CusName.sendKeys("Customer10");
	}
	public void NewPName() {
		ProjName.sendKeys("Project2");
		}
	public void CopyProClick() {
		CopyProp.click();
	}
	public void ddButton2Click() {
		ddButton2.click();
	}
	public void BBCClick() {
		BBC.click();
	}
	public void CheckboxClick() {
		Checkbox.click();
	}
	public void CopyPropertiesClick() {
		CopyProperties.click();
	}
	
}

