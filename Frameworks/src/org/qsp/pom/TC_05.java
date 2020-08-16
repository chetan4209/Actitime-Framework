package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_05 {
	@FindBy(xpath="//a[contains(text(),'View Time-Track')]")
	private WebElement ViewTTrack;
	@FindBy(xpath="//td[@class='generatePDF headerFooterCell activeButton cellWithBorder']")
	private WebElement ExpToPDF;
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement DownloadPDF;
	
	public TC_05(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ViewTTrackClick() {
		ViewTTrack.click();
	}
	public void ExpToPDFClick() {
		ExpToPDF.click();
	}
	public void DownloadPDFClick() {
		DownloadPDF.click();
	}

}
