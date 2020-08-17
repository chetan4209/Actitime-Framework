package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_17;
import org.testng.annotations.Test;

public class TestTC_17 extends BaseTest{
	@Test
	public void TC17() throws Exception, InvalidFormatException, InterruptedException, IOException {
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
		
		TC_17 tc17= new TC_17(driver);
		tc17.TaskClick();
		Thread.sleep(3000);
		tc17.ManagerClick();
		tc17.AddMgrClick();
		tc17.UserNameClick();
		tc17.Scrollup(driver);
		tc17.Scrollupclick(driver);
        tc17.RemoveClick();
}
}
