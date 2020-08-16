package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_16 {
	@FindBy(xpath="//div[contains(@class,'task')][contains(text(),'NASA negotiations')]")
    private WebElement NasaTask;
	@FindBy(xpath="//div[contains(@class,'tabs')]//div[contains(@class,'details')]")
    private WebElement Details;
	@FindBy(xpath="//div[contains(@class,'workflowStatus statusType_open statusColor_darkGreen statusTypeIcon_darkGreen withPrefix showArrow')]")
    private WebElement Status;
	@FindBy(xpath="//div[contains(@class,'cellButton')]//div[contains(@class,'name')][contains(text(),'Review')]")
    private WebElement Review;
	
	public TC_16(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void NasaTaskClick() {
		NasaTask.click();
	}
	public void DetailsClick() {
		Details.click();
	}
	public void StatusClick() {
		Status.click();
	}
	public void ReviewClick() {
		Review.click();
	}

}
