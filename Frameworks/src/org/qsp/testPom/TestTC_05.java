package org.qsp.testPom;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.qsp.pom.ReportPage;
import org.qsp.pom.TC_05;
import org.testng.annotations.Test;

public class TestTC_05 extends BaseTest {
	@Test
	public void TC_05() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		Thread.sleep(3000);
		ReportPage rp= new ReportPage(driver);
		rp.timetrack();
		
		Thread.sleep(3000);
		TC_05 tc5= new TC_05(driver);
		tc5.ViewTTrackClick();
		tc5.ExpToPDFClick();
		tc5.DownloadPDFClick();
	
	}
}
