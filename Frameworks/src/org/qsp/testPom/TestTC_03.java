package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.Result;
import org.qsp.pom.TC_03;

import org.testng.annotations.Test;

public class TestTC_03 extends BaseTest {
	@Test
	public void TC_03() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		Thread.sleep(3000);
		ReportPage rp= new ReportPage(driver);
		rp.timetrack();
		
		Thread.sleep(3000);
		TC_03 tc3= new TC_03(driver);
		Thread.sleep(3000);
		tc3.NewClick();
		tc3.mouseOver(driver);
		tc3.ddButtonClick();
		tc3.Scrollup(driver);
		tc3.Scrollupclick(driver);
		tc3.NewCusClick();
		tc3.NewCusName();
		tc3.NewPName();
		tc3.NewTaskName();
		tc3.EstiName();
		tc3.DlineClick();
		tc3.DlineDateClick();
		tc3.CreatTaskClick();
		Thread.sleep(3000);
		//tc2.mouseOver1(driver);
		tc3.ClickViewTask();
		Thread.sleep(3000);
		tc3.ActionsClick();
		tc3.DeleteClick();
		tc3.DeletePClick();
		Thread.sleep(5000);
		Result etp = new Result(driver);
	    etp.verify(driver, ETO, title);
	}


}
