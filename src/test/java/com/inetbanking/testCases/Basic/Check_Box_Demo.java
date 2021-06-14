package com.inetbanking.testCases.Basic;

import org.testng.annotations.Test;

import com.inetbanking.pages.BasicPage;
import com.inetbanking.utilities.BaseClass;

public class Check_Box_Demo extends BaseClass {
	
	@Test
	public void test()
	{
		BasicPage Step1 = new BasicPage(driver);
		logger.info("Launching test site");
		Step1.fnLaunchTestSite();
		logger.info("Validating Launch");
		Step1.fnValidateLaunch();
		logger.info("Close pop up");
		Step1.fnClosePopup();
		logger.info("Opening Check Box demo");
		Step1.fnCheckBoxDemo();
		logger.info("Fill Check box demo");
		Step1.fnFillCheckBoxDemo();
	}

}
