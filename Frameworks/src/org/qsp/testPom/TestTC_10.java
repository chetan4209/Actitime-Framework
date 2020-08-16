package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_10;
import org.testng.annotations.Test;

public class TestTC_10 extends BaseTest {
	@Test
	public void TC10() throws Exception, InvalidFormatException, InterruptedException, IOException {
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
		
		TC_10 tc10= new TC_10(driver);
		tc10.ViewTimeTrackClick();
		tc10.FiltersClick();
		tc10.CustProjectDDClick();
		tc10.RadioButtonClick();
		tc10.ResetClick();
		tc10.CloseClick();
		tc10.NotReadyClick();
		tc10.AproveBClick();
		tc10.ApplyClick();
		

}

}
