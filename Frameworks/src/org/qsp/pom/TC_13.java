package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_13 {
	@FindBy(xpath="//div[contains(text(),'Robotics research')]")
	private WebElement Robotics;
	@FindBy(xpath="//div[@class='reportedTime']")
	private WebElement RTime;
	
	public TC_13(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void RoboticsClick() {
		Robotics.click();
	}
	public void mouseOver(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(RTime).build().perform();
	}
	public void RTimeClick() {
		RTime.click();

}}
