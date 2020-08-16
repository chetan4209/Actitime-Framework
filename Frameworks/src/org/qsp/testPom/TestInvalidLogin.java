package org.qsp.testPom;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.LoginPage;
import org.testng.annotations.Test;

public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() throws Exception, InvalidFormatException, InterruptedException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 2, 2);
		//String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
		
		LoginPage lp =new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		
		//EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		//etp.verifyHPisDisplayed(driver, ETO, title);
	}

}
