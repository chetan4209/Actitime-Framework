package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_08;
import org.testng.annotations.Test;

public class TestTC_08 extends BaseTest  {
	@Test
	public void TC_08() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		//String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		Thread.sleep(3000);
		ReportPage rp= new ReportPage(driver);
		rp.timetrack();
		
		Thread.sleep(3000);
		TC_08 tc8= new TC_08(driver);
		Thread.sleep(3000);
		tc8.NewClick();
		tc8.mouseOver(driver);
		tc8.ddButtonClick();
		tc8.Scrollup(driver);
		tc8.Scrollupclick(driver);
		tc8.NewCusClick();
		tc8.NewCusName();
		tc8.NewPName();
		tc8.NewTaskName();
		tc8.EstiName();
		tc8.DlineClick();
		tc8.DlineDateClick();
		tc8.CreatTaskClick();
		Thread.sleep(3000);
		tc8.ViewTaskClick();
		tc8.ActionsClick();
		tc8.CopyToClick();
		tc8.SelCustClick();
		tc8.SelCompClick();
		tc8.SelProjectClick();
		tc8.androidpClick();
		Thread.sleep(3000);
		tc8.ScrolltoCopy(driver);
		tc8.ScrollCopyclick(driver);
	}

}
