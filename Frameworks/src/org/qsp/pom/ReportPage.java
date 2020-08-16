package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {
	@FindBy(id="container_tt")
	private WebElement TimeTrack;
	public ReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void timetrack() {
		TimeTrack.click();
	}
}
