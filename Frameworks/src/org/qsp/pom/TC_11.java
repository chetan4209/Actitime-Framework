package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_11 {
	@FindBy(xpath="//span[contains(text(),'Add Tasks from the List')]")
	private WebElement AddTask;
	@FindBy(xpath="//div[@class='customerProjectSelector activeProjects']//td[@class='dropdownButton']")
	private WebElement CustDD;
	@FindBy(xpath="//td[contains(text(),'Galaxy Corporation')]")
	private WebElement GalaxyCorp;
	@FindBy(xpath="//span[contains(text(),'Robotics research')]")
	private WebElement Robotics;
	@FindBy(xpath="//button[contains(@class,'addSelectedButton')]")
	private WebElement AddSelected;
	
	public TC_11(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void AddTaskClick() {
		AddTask.click();
	}
	public void CustDDClick() {
		CustDD.click();
	}
	public void GalaxyCorpClick() {
		GalaxyCorp.click();
	}
	public void RoboticsClick() {
		Robotics.click();
	}
	public void AddSelectedClick() {
		AddSelected.click();
	}

}
