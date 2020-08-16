package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_14;
import org.testng.annotations.Test;

public class TestTC_14 extends BaseTest {
	@Test
	public void TC14() throws Exception, InvalidFormatException, InterruptedException, IOException {
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
		
		TC_14 tc14= new TC_14(driver);
		tc14.TaskClick();
		Thread.sleep(3000);
		tc14.AssUserClick();
		tc14.AssignClick();
		tc14.UserNameClick();
		Thread.sleep(3000);
		tc14.Scrollup(driver);
		tc14.Scrollupclick(driver);
		Thread.sleep(3000);
}}
