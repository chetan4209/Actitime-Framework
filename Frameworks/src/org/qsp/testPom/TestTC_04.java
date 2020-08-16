package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_04;
import org.testng.annotations.Test;

public class TestTC_04 extends BaseTest{
	@Test
	public void TC_04() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		//String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
		//String CName=XL.getdata(XL_PATH, SHEET_NAME, 1, 3);
		//String PName=XL.getdata(XL_PATH, SHEET_NAME, 1, 4);
		//String TName=XL.getdata(XL_PATH, SHEET_NAME, 1, 5);
		//String estimate=XL.getdata(XL_PATH, SHEET_NAME, 1, 6);
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		Thread.sleep(3000);
		ReportPage rp= new ReportPage(driver);
		rp.timetrack();
		
		Thread.sleep(3000);
		TC_04 tc4= new TC_04(driver);
		Thread.sleep(3000);
		tc4.NewClick();
		tc4.mouseOver(driver);
		tc4.ddButtonClick();
		tc4.Scrollup(driver);
		tc4.Scrollupclick(driver);
		tc4.NewCusClick();
		tc4.NewCusName();
		tc4.NewPName();
        tc4.CopyProClick();
        tc4.ddButton2Click();
        tc4.BBCClick();
        tc4.CheckboxClick();
        Thread.sleep(2000);
        tc4.CopyProClick();
}
}
