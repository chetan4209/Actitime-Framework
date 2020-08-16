package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_07;
import org.testng.annotations.Test;

public class TestTC_07 extends BaseTest {
	@Test
	public void TC_07() throws Exception, InvalidFormatException, InterruptedException, IOException {
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
		TC_07 tc7= new TC_07(driver);
		Thread.sleep(3000);
		tc7.NewClick();
		tc7.mouseOver(driver);
		tc7.ddButtonClick();
		tc7.Scrollup(driver);
		tc7.Scrollupclick(driver);
		tc7.NewCusClick();
		tc7.NewCusName();
		tc7.NewPName();
		tc7.NewTaskName();
		tc7.EstiName();
		tc7.DlineClick();
		tc7.DlineDateClick();
		tc7.CreatTaskClick();
		Thread.sleep(3000);
		tc7.ViewTaskClick();
		tc7.ActionsClick();
		tc7.CopyToClick();
		tc7.SelCustClick();
		tc7.SelCompClick();
		tc7.SelProjectClick();
		tc7.androidpClick();
		Thread.sleep(3000);
		tc7.ScrolltoCopy(driver);
		tc7.ScrollCopyclick(driver);
	}
}
