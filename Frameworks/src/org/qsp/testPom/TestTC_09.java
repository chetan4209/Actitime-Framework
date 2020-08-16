package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_09;
import org.testng.annotations.Test;

public class TestTC_09 extends BaseTest{
	@Test
	public void TC_09() throws Exception, InvalidFormatException, InterruptedException, IOException {
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
		
		TC_09 tc9= new TC_09(driver);
		tc9.ViewTimeTrackClick();
		tc9.FiltersClick();
		tc9.CustProjectDDClick();
		tc9.RadioButtonClick();
		Thread.sleep(3000);
		tc9.ResetClick();
		tc9.CloseClick();
		tc9.NotReadyClick();
		tc9.ReadyForApprClick();
		Thread.sleep(3000);
		tc9.ApplyClick();
		

}
}
