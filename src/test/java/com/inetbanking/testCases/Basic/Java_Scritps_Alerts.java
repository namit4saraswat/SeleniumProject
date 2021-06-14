package com.inetbanking.testCases.Basic;

import org.testng.annotations.Test;

import com.inetbanking.pages.BasicPage;
import com.inetbanking.utilities.BaseClass;

public class Java_Scritps_Alerts extends BaseClass {
	@Test
	public void test() throws InterruptedException
	{
		BasicPage Step1 = new BasicPage(driver);
		logger.info("Launching test site");
		Step1.fnLaunchTestSite();
		logger.info("Validating Launch");
		Step1.fnValidateLaunch();
		logger.info("Close pop up");
		Step1.fnClosePopup();
		logger.info("Launch JSAlert");
		Step1.fnJavaScriptsAlert();
		Step1.fnfillJSAlert();
	}	
}
