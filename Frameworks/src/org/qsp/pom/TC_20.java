package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_20 {
		@FindBy(xpath="//div[contains(@class,'task')][contains(text(),'NASA negotiations')]")
	    private WebElement NasaTask;
		@FindBy(xpath="//div[contains(@class,'tabs')]//div[contains(@class,'details')]")
	    private WebElement Details;
		@FindBy(xpath="//span[contains(text(),'Set up deadline')]")
	    private WebElement SetDeadline;
		@FindBy(xpath="//td[contains(@class,'x-date-active')]//span[contains(text(),'28')]")
	    private WebElement Date;
		
		public TC_20(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void NasaTaskClick() {
			NasaTask.click();
		}
		public void DetailsClick() {
			Details.click();
		}
		public void SetDeadlineClick() {
			SetDeadline.click();
		}
		public void DateClick() {
			Date.click();
		}

	}

