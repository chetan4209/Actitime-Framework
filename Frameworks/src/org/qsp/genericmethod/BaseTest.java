package org.qsp.genericmethod;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements  IAutoConst {
	static {
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		}
		if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		}
	}
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
		if(BROWSER_NAME.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		if(BROWSER_NAME.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
		//driver.findElement(By.id("username")).sendKeys("admin");
	   // driver.findElement(By.name("pwd")).sendKeys("manager" , Keys.ENTER);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult testResult) throws Exception {
		String name = testResult.getName();
		int status = testResult.getStatus();
		if (status ==1) {
			Reporter.log(" Test " + name + " is passed ", true);
		}else {
			Reporter.log(" Test " + name + " is failed ", true);
			String path = IMGPATH + name + ".png";
			FWUtil.getphoto(driver, path);
		}
		driver.close();
			
		}
		
	}


