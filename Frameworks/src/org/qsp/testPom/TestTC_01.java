package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_01;
import org.testng.annotations.Test;

public class TestTC_01 extends BaseTest {
	@Test
	public void TC_01() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		//String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
		String CName=XL.getdata(XL_PATH, SHEET_NAME, 1, 3);
		String PName=XL.getdata(XL_PATH, SHEET_NAME, 1, 4);
		String TName=XL.getdata(XL_PATH, SHEET_NAME, 1, 5);
		String estimate=XL.getdata(XL_PATH, SHEET_NAME, 1, 6);
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		Thread.sleep(3000);
		ReportPage rp= new ReportPage(driver);
		rp.timetrack();
		
		Thread.sleep(3000);
		TC_01 ttp= new TC_01(driver);
		Thread.sleep(3000);
		ttp.NewClick();
		ttp.mouseOver(driver);
		ttp.ddButtonClick();
		ttp.NewCusClick();
		ttp.NewCusName(CName);
		ttp.NewPName(PName);
		ttp.NewTaskName(TName);
		ttp.EstiName(estimate);
		ttp.DlineClick();
		ttp.DlineDateClick();
		ttp.CreatTaskClick();
		
		
	}

}
