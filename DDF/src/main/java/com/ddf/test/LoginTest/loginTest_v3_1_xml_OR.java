package com.ddf.test.LoginTest;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ddf.base.BaseUI_v1;
import com.ddf.base.BaseUI_v2;
import com.ddf.base.BaseUI_v3;
import com.ddf.base.BaseUI_v3_xml_OR;
import com.ddf.utils.ExtentReportManager;

public class loginTest_v3_1_xml_OR extends BaseUI_v3_xml_OR {
	ExtentReports report=ExtentReportManager.getReportInstance();
	
	@Test
	public void testOne() throws InterruptedException, IOException, DocumentException {
		

		 logger = report.createTest("Test one");
		logger.log(Status.INFO, "Initializing the browser");
		invokeBrowser("chrome");

		logger.log(Status.INFO, "Opening URL");
		openURL("websiteURL");
		logger.log(Status.INFO, "Clicked sign in button");
		elementClick("signinBtn_Xpath");
		//xml implemented only for this - not for other functions 
		
		enterText("usernameTextbox_Xpath","U S E R N A M E");
		//logger.log(Status.PASS,"Test case passed successfully");
		
		//Simulating failure below - its not actual failure 
		//also, image is dummy - we need to implement capturescreenshot function 
		logger.log(Status.FAIL,"Test case failed");
		logger.addScreenCaptureFromPath("C:\\Users\\Anuj\\Pictures\\01.09.2021_14.47.14_REC.png");
		//takeScreenShotOnFailure();

		Thread.sleep(2000);
		tearDown();
	}
	
	@AfterTest
	public void endReport() {
		report.flush();
	}
	
	//@Test(dependsOnMethods="testOne")
	public void testTwo() throws DocumentException {
		invokeBrowser("chrome");
		openURL("websiteURL");
		
		//openURL("https://money.rediff.com/index.html");
		//test code to show next function usage - above code not changed to use properties file 
		tearDown();
	}
	
	//@Test(dependsOnMethods="testTwo")
	
	public void testThree() throws DocumentException {
		invokeBrowser("chrome");
		//openURL("https://shopping.rediff.com/");
		//test code to show next function usage - above code not changed to use properties file
		tearDown();
	}
}
